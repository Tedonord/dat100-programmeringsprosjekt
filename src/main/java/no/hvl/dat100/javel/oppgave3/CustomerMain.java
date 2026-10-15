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
       cus[1] = new Customer("Olivia", "okaglen", 1, PowerAgreementType.SPOTPRICE);
       cus[2] = new Customer(null, null, 0, null);

       String kunde = cus[1].toString();
       System.out.printf(kunde);
       
       System.out.println(cus[1].getName());
       cus[1].setName("Bingbong");
       System.out.println(cus[1].getName());
       kunde = cus[1].toString();
       System.out.printf(kunde);

       cus[2].setName("Bingus");
       cus[2].setCustomerid(67);
       cus[2].setEmail("bingus@icloud.com");
       cus[2].setPAT(PowerAgreementType.NORGESPRICE);

       System.out.println(cus[2].getName());
       System.out.println(cus[2].getCustomerid());
       System.out.println(cus[2].getEmail());
       System.out.println(cus[2].getPowerAgreementType());

       Customer bjorn = new Customer("Bjørn", "bjoernmail@gmail.com", 3, PowerAgreementType.POWERSUPPORT);
       System.out.println(bjorn.toString());

    }
}
