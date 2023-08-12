package enumClass;

public enum Level {
    STANDARD("Level Standard"),
    PREMIUM("Level Premium"),
    VIP("Level VIP");

    //buat field description
    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
