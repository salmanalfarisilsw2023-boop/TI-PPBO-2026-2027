import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[10];

        System.out.println("masukkan 10 angka:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        System.out.println("\n=== array dalam ukutan terbalik ===");
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.println("elemen ke-" + (i + 1) + ": " + data[i]);
        }
        input.close();
    }
}
