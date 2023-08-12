package encapsulation;

public class Category {

    /**
     * Encapsulation adalah memastikan data sensitif (field) sebuah object tesembunyi dari akses luar.
     * biasanya field nya menggunakan access modifier (private)
     *
     * penggunakan getter setter adalah best practice pada Java.
     * Jadi getter setter nya yang dibuat sebagai public
     */

    private String id;
    private boolean expensive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.equals("")) {
            System.out.println("ID Tidak Boleh Kosong atau NULL!");
        } else {
            this.id = id;
        }
    }



    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
