package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        MonthlyPower.print_PowerUsage(power_usage_month);
        MonthlyPower.print_PowerPrices(power_prices_month);
        double totalforbruk = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("%.2f kWh\n",totalforbruk);

        boolean over = MonthlyPower.exceedThreshold(power_usage_month, 1000);
        System.out.println(over);

        double totalpris = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.printf("%.2f NOK\n",totalpris);

        double supp = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.printf("%.2f NOK\n",supp);

        double norgespris = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.printf("%.2f NOK\n",norgespris);

    }
}