import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan sebuah angka: ");
        int angka = input.nextInt();

        System.out.println("=== tabel perkalian " + angka + " ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
        input.close();
    }
}
