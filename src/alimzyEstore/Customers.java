package alimzyEstore;

public class Customers extends Users{
    private BillingInformation billingInformation;
    private ShoppingCart shoppingCart;

    Customers(String name, int age, String emailAddress, Address homeAddress, String password, int phone, BillingInformation billingInformation,ShoppingCart shoppingCart){
        super(name, age, emailAddress, homeAddress, password, phone);
        this.billingInformation = billingInformation;
        this.shoppingCart = shoppingCart;

    }
}
