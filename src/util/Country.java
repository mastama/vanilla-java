package util;

public class Country {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // buat static city sebagai innerClass Country

    public static class city {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

//        public String getCountry() {
//            return Country.this.name;
//        }
    }
}
