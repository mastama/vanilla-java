package overriding;

public class OverridingApp {
    public static void main(String[] args) {

        /**
         * Overriding = menggunakna method yang ada pada parentClass
         */

        Shape shape = new Shape();
        shape.getCorner();

        Rectangle rectangle = new Rectangle();
        rectangle.getCorner();

        System.out.println(shape.getCorner());

        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
