import java.util.Scanner;

public class operasiDuaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        // Operator Aritmatika
        System.out.println("\n--- Hasil Aritmatika ---");
        System.out.println("Penjumlahan (+): " + (a + b));
        System.out.println("Pengurangan (-): " + (a - b));
        System.out.println("Perkalian (*): " + (a * b));
        System.out.println("Pembagian (/): " + (a / b));
        System.out.println("Sisa Bagi (%): " + (a % b));

        // Operator Perbandingan
        System.out.println("\n--- Hasil Perbandingan ---");
        System.out.println("Apakah a > b? " + (a > b));
        System.out.println("Apakah a < b? " + (a < b));
        System.out.println("Apakah a == b? " + (a == b));
    }
}