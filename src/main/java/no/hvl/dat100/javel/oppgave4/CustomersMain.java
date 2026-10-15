package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer jakob = new Customer("Jakob", "email", 69, PowerAgreementType.NORGESPRICE);
        Customer nils = new Customer("Nils", "nilsemail", 67, PowerAgreementType.NORGESPRICE);
        Customers obj = new Customers(5);

        int nonnull= obj.countNonNull();
        System.out.println(nonnull);

        System.out.println(obj.addCustomer(jakob));
        System.out.println(obj.addCustomer(nils));
        nonnull= obj.countNonNull();
        System.out.println(nonnull);

        obj.removeCustomer(67);

        Customer[] liste = obj.getCustomers();
        
        for (Customer customer : liste){
            System.out.println(customer.toString());
        }
    }
}
