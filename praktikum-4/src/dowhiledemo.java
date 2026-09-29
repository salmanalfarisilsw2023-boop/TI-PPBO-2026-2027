import java.util.Scanner;

public class dowhiledemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        do {
            System.out.print("masukkan angka (0 untuk berhenti): ");
            angka = sc.nextInt();
            System.out.println("anda memasukkan: " + angka);
        } while (angka != 0);

        System.out.println("program berhenti");
    }
}
