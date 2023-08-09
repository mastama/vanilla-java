package defaultMethods;

import interfaceInheritance.Motor;

public class Bus implements Motor {
    public void drive() {
        System.out.println("Bus Drive");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isMainteances() {
        return false;
    }

    /**
     * default method ini diperlukan jika kita sudah memiliki terlalu banyak class yang implement interface tsb.
     * maka kalau kita bikin satu method di interface tsb, secara otomatis semua class yang implement akan error karena
     * harus meng-ovveride method tsb.
     * <p>
     * jadi, dengna menggunakan default method, kita bisa menambahkan konkrit method di interface tanpa semua class yang
     * diawal meng-implement interface tsb (jadi bisa ditambahkan di class yang ingin ditambahakan saja)
     */

    public boolean isBig() {
        return Motor.super.isBig();
    }
}
