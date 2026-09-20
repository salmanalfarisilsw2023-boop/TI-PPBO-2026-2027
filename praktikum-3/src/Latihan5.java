import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = sc.nextDouble();

        double tinggiM = tinggiCm / 100.0;
        double bmi = berat / (tinggiM * tinggiM);

        System.out.printf("Indeks Massa Tubuh (BMI) Anda: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}