package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
       Customer cus[] = new Customer[3];
       cus[0] = new Customer("Teodor", "hauglandgutten", 0, PowerAgreementType.NORGESPRICE);
       cus[1] = new Customer("Olivia", "okaglen", 0, PowerAgreementType.SPOTPRICE);

       String kunde = cus[0].toString(cus[0]);
       System.out.printf(kunde);
       
    }
}
