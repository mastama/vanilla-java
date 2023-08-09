package toString;

public class Product {
    private String name;
    private String price;

    //constructor
    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Product() {}

    public String toString() {
        return "Product name: " + this.name + "," + " price: " + this.price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
