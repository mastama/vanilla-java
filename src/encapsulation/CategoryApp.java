package encapsulation;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("123");
        category.setExpensive(false);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
