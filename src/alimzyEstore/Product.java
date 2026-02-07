package alimzyEstore;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;
    private ProductCategory category;


    Product(int id, String name, double price, String description, ProductCategory category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;


    }
}

