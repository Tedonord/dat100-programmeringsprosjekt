package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;

        for (Customer customer : customers)
            if (customer != null){
                count +=1;
            }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        boolean funnet = false;
        Customer c = null;

        for (Customer customer : customers){
            if (customer != null){
                if (customer.getCustomerid()==customer_id){
                    funnet = true;
                    return customer;
                }
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = c;
                return true;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        boolean deleted = false;
        Customer c = null;
        
        for (int i = 0; i < customers.length;i++){
            if (customers[i] != null){
                if (customers[i].getCustomerid()==customer_id){
                    c = customers[i];
                    customers[i] = null;
                    deleted = true;
                    return customers[i];
                }
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        Customer[] customers = null;

        int antall = countNonNull();
        customers = new Customer[antall];

        int i = 0;
        for (Customer customer : this.customers){
            if (customer != null){
                customers[i] = customer;
                i++;
            }
        }


        return customers;
    }
}