package equalsMethod;

public class EqualsApp {
    public static void main(String[] args) {

        Product product = new Product("Xiabe", "3700000");
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        Product product2 = new Product("Xiabe", "3700000");

        /**
         * pada java penggunaan equals untuk pembading type data object(string): yang akan di bandingkan adalah value dari object tsb
         * sedankan untuk == / != untuk pembading type data object(string): yang akan di bandingkan adalah tempat object disimpan pada memori
         */
        //ini akan menghasilkan true
        System.out.println(product.equals(product2));

        //ini akan menghasilakn fals
        System.out.println(product == product2);
    }
}
