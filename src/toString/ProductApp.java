package toString;

public class ProductApp {
    public static void main(String[] args) {

        //menggunakan constructor tanpa parameter
        Product product = new Product();
        product.setName("Ideapad Gaming 3i");
        product.setPrice("15000000");
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        System.out.println("===========================================");

        //menggunakan constructor dengan parameter
        Product product1 = new Product("KLX", "450000000");
        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1);
    }
}
