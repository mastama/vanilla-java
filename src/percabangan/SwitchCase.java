package percabangan;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /**
         * Membuat peraturan lampu lalu lintas
         * dengan switch case
         */

        //deklarasi variable
        String lampu;

        //instance object Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Start process for lampu lalu lintas");
        System.out.print("Masukkan warna lampu: ");
        lampu = scan.next();

        // mengubah input menjadi huruf kecil
        lampu = lampu.toLowerCase();

        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah cok, Berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning cok, Bersiap!");
                break;
            case "hijau":
                System.out.println("Lampu hijau cok, Gaszzzzz!");
                break;
            default:
                System.out.println("Warna lampu salah cok. Merah, Kuning, Hijau");
        }
    }
}
