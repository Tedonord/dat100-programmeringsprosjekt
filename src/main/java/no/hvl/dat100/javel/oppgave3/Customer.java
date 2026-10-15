package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomerid(){
        return customer_id;
    }
    public PowerAgreementType getPowerAgreementType(){
        return agreement;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCustomerid(int customerid){
        this.customer_id = customerid;
    }
    public void setPAT(PowerAgreementType agreement){
        this.agreement = agreement;
    }
    
    public String toString(){
        String navn = getName();
        String email = getEmail();
        int customerid = getCustomerid();
        PowerAgreementType agreement = getPowerAgreementType();
        String utskrift = ("Customer number: "+customerid+"\n Navn: "+navn+"\n Email: "+email+"\n Power Agreement: "+agreement+"\n");
        return utskrift;
    }

}
