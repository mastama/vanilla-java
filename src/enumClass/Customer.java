package enumClass;

public class Customer {
    private String name;
    private String level;

    public Customer(String name, String level) {
        this.name = name;
        this.level = level;
    }

    public Customer() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
