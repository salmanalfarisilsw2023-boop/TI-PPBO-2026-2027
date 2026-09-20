import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = sc.nextInt();

        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        boolean isMahasiswa = sc.nextBoolean();

        int hargaTiket;

        if (isMahasiswa && umur < 25) {
            hargaTiket = 30000; // Harga khusus
            System.out.println("Selamat! Anda mendapatkan diskon harga tiket khusus mahasiswa.");
        } else {
            hargaTiket = 50000; // Harga normal
            System.out.println("Harga tiket normal.");
        }

        System.out.println("Total harga tiket: Rp " + hargaTiket);
    }
}