package innerOuterClass;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("Name company tidak boleh kosong");
        } else {
            this.name = name;
        }
    }

    /**
     * Buat class Employee sebagai innerClass Company
     */
    public class Employee {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.equals("")) {
                System.out.println("Name employee tidak boleh kosong");
            } else {
                this.name = name;
            }
        }

        /**
         * Buat method baru di innerClass untuk mengambil atribut dari outerClass
         *
         */
        public String getCompany() {
            return Company.this.name;
        }
    }

}
