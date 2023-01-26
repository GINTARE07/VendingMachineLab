package operations;

import products.Product;

import java.util.ArrayList;

public class Drawer {
    private Code code;
    private double price;
    private ArrayList<Product> products;

    public Drawer(Code code, double price){
        this.code = code;
        this.price = price;
        this.products = new ArrayList<>();
    }

    public Code getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public int getProductCount() {
        return this.products.size();
    }

    public void removeProduct(Product product) {
        if (products.size() > 0){
        products.remove(product);
    }}

}
