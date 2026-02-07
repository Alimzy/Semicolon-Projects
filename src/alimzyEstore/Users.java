package alimzyEstore;

public class Users {

    private String name;
    private int age;
    private String emailAddress;
    private Address homeAddress;
    private String password;
    private int phone;




    Users(String name,int age, String emailAddress, Address homeAddress,String password,int phone){

        this.name = name;
        this.age = age;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
        this.password = password;
        this.phone = phone;
    }
}
