import java.util.Scanner;

public class kalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== KALKULATOR BANGUN DATAR ===");

        // 1. Luas dan Keliling Persegi Panjang
        System.out.println("\n--- 1. Persegi Panjang ---");
        System.out.print("Masukkan panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = sc.nextDouble();

        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        // 2. Luas dan Keliling Lingkaran
        System.out.println("\n--- 2. Lingkaran ---");
        System.out.print("Masukkan jari-jari (r): ");
        double r = sc.nextDouble();

        double luasLingkaran = Math.PI * r * r;
        double kelilingLingkaran = 2 * Math.PI * r;

        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
    }
}