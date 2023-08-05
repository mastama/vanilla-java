package percabangan;

import java.util.Scanner;

public class OperatorTenary {

    public static void main(String[] args) {

        //deklarasi variable
        int suka = 0;
        int tidakSuka = 0;
        String jawaban;

        // instance object Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("==========Mulai Menghitung==========");
        System.out.println("Masukkan nilai suka: ");
        suka = scan.nextInt();

        System.out.println("Masukkan nilai tidakSuka");
        tidakSuka = scan.nextInt();

        // buat validasi
        jawaban = suka > tidakSuka ? "Banyak Fans" : "Banyak Hatters";
        System.out.println("Anda memiliki: " + jawaban);

        System.out.println("==========Berhenti Menghitung==========");

    }
}
