package equalsMethod;

import java.util.Objects;

public class Product {

    private String name;
    private int price;

    public Product(String name, String price) {
        this.name = name;
        this.price = Integer.parseInt(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * equals method pada java digunakan untuk membadingkan string(object).
     * sedangkan untuk tipe data primitif pembadingan menggunakna == atau !=
     *
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
}
