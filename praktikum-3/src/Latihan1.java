import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan GENAP");
        } else {
            System.out.println(angka + " adalah bilangan GANJIL");
        }
    }
}