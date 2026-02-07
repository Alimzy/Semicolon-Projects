package alimzyEstore;

public class BillingInformation {
    private int phoneNumber;
    private String name;
    private Address address;

    BillingInformation(int phoneNumber, String name,Address address){
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;

    }

}
