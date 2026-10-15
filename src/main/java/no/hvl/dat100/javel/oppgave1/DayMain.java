package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) throws Exception{

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        DailyPower.printPowerPrices(powerprices_day);
        DailyPower.printPowerUsage(powerusage_day);

        double totalpowerusage = DailyPower.computePowerUsage(powerusage_day);
        System.out.println(totalpowerusage + " kWh");
        
        double totalspotprice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK\n",totalspotprice);
        /*
        double getsupport = DailyPower.getSupport(powerusage_day[8], powerprices_day[8]);
        System.out.printf("%.2f NOK\n",getsupport);
        */
        double computesupp = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("%.2f NOK\n", computesupp);

        double norgespris = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("%.2f NOK\n", norgespris);

        double maks = DailyPower.findPeakUsage(powerusage_day);
        System.out.printf("%.2f kWh\n", maks);

        double average = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("%.2f kWh\n", average);
        

    }
}
