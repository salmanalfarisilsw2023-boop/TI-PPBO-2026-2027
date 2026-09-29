import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan tinggi/ukuran: ");
        int ukuran = input.nextInt();

        System.out.println("\n-- pola segitiga terbalik ---");
        for (int i = ukuran; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n--- pola persegi ---");
        for (int i = 1; i <= ukuran; i++) {
            for  (int j = 1; j <= ukuran; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
