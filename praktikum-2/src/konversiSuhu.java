import java.util.Scanner;
public class konversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = sc.nextDouble();
        double fahrenheit = (celcius * 9 / 5) + 32;
        System.out.print("suhu dalam Fahranheit: " + fahrenheit);

    }
}
