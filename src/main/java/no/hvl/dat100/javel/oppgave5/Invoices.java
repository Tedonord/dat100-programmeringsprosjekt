package no.hvl.dat100.javel.oppgave5;
import java.lang.reflect.InvocationHandler;

import no.hvl.dat100.javel.oppgave5.Invoice;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        for (Invoice invoice : invoices){
            System.out.println("================");
            invoice.printInvoice();
            System.out.println("================");
        }

    }
}
