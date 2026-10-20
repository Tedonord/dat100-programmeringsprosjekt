package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave5.Invoices;
public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses the methods implemented in the Invoice-classes

        */
        Customer jakob = new Customer("jakob", "jakob@hvl.no", 6, PowerAgreementType.NORGESPRICE);
        Invoice invoice1 = new Invoice(jakob, "Mars", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        //invoice1.printInvoice();

        Customer lise = new Customer("lise", "lise@icloud.com", 5, PowerAgreementType.POWERSUPPORT);
        Invoice invoice2 = new Invoice(lise, "Mars", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        //invoice2.printInvoice();

        Customer lars = new Customer("Lars", "Lars@gmail.com", 67, PowerAgreementType.SPOTPRICE);
        Invoice invoice3 = new Invoice(lars, "Mars", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);
        //invoice3.printInvoice();

        Invoice[] invoices = new Invoice[3];
        invoices[0] = invoice1;
        invoices[1] = invoice2;
        invoices[2] = invoice3;
        
        Invoices.processInvoices(invoices);

    }
}
