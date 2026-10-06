package uk.ac.westminster.products_api;

public class Product {

    //private -
    //public -
    //protected - only inside a package
    //default - inside the package and the subclasses
    public Long id;
    public String name;
    public double price;

    public Product(Long id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
