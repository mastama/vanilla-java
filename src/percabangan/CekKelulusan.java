package percabangan;

import java.util.Scanner;

public class CekKelulusan {
    public static void main(String[] args) {

        // instance object Scanner
        Scanner input = new Scanner(System.in);

        // deklarasi variable
        String nama;
        int nilai;

        System.out.println("=======Start Penilaian Akhir Tahun Genap=======");
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        //close
        input.close();

        //cek nilai apakah lulus atau tidak
        if (nilai >= 80) {
            System.out.println("Selamat " + nama + " Lulus dengan nilai A");
        } else if (nilai >= 60 && nilai < 80) {
            System.out.println("Selamat " + nama + " Lulus dengan nilai B");
        } else {
            System.out.println("Mohon maaf " + nama + " Tidak Lulus");
        }

        System.out.println("=======End Penilaian Akhir Tahun Genap=======");
    }
}
