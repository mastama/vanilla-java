package percabangan;

import java.util.Scanner;

public class Kasir {
    /**
     * Apakah anda punya kartu member?
     *    - ya
     *        * Apakah belanjaan anda lebih dari 500rb?
     *            # ya : mendapatkan diskon 50rb
     *            # tidak : tidak mendapatkan diskon
     *        * Apakah belanjaan anda lebih dari 100rb?
     *            # ya : mendapatkan diskon 15rb
     *            # tidak: tidak mendapatkan diskon
     *    - tidak
     *        * Apakah belanjaan anda lebih dari 100rb?
     *            # ya : mendapatkan diskon 10rb
     *            # tidak: tidak mendapatkan diskon
     */
    public static void main(String[] args) {

        //deklarasi variable
        String kartu;
        double totalBelanjaan;
        double diskon = 0;
        double totalBayar;

        //instance object Scanner
        Scanner input = new Scanner(System.in);


        System.out.println("Mulai menghitung total belanjaan");
        System.out.print("Apakah Anda memiliki kartu member?: ");
        kartu = input.next();

        /**
         * NOTED: Jika sudah menggunakan equalsIgnoreCase() maka tidak memperdulikan besar kecil case
         * Jika menggunakna equals() maka perlu di case dulu string nya.
         */
        // inisasi input toLowerCase() jika menggunakna equals()
        //kartu = kartu.toLowerCase();

        System.out.print("Masukkan totalBelanjaan: ");
        totalBelanjaan = input.nextDouble();

        // buat validasi
        if (kartu.equalsIgnoreCase("ya")
                || kartu.equalsIgnoreCase("iya")) {
            if (totalBelanjaan > 500000) {
                diskon = 50000;
                System.out.println("Selamat Anda mendapatkan diskon: " + diskon);
            } else if (totalBelanjaan < 500000 && totalBelanjaan > 250000) {
                diskon = 30000;
                System.out.println("Selamat Anda mendapatkan diskon: " + diskon);
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
            }
        }
        if (kartu.equalsIgnoreCase("tidak")
                || kartu.equalsIgnoreCase("ngga")) {
            if (totalBelanjaan > 100000) {
                diskon = 10000;
                System.out.println("Selamat Anda mendapatkan diskon: " + diskon);
            } else {
                System.out.println("Anda tidak mendapatkan diskon");
            }
        }

        // total yang harus dibayar
        totalBayar = totalBelanjaan - diskon;
        System.out.println("Total bayar: Rp " + totalBayar);
        System.out.println();
        System.out.println("Selesai menghitung total belanjaan");
    }
}
