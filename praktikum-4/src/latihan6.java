import java.util.Scanner;

public class latihan6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] data = new int[n];

        System.out.println("masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print("elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        System.out.print("\narray sebelum diurutkan: ");
        for (int val : data) {
            System.out.print(val + "");
        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        System.out.print("array sesudah di urutkan(ascending): ");
        for (int val : data) {
            System.out.print(val + " ");
        }
        System.out.println();
        input.close();
    }
}
