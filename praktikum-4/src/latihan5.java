import java.util.Scanner;

public class latihan5 {
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
        int terbesar = Integer.MIN_VALUE;
        int terbesarkedua = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (data[i] > terbesar) {
                terbesarkedua = terbesar;
                terbesar = data[i];
            } else if (data[i] > terbesarkedua && data[i] != terbesar) {
                terbesarkedua = data[i];
            }
        }
        System.out.println("\n=== hasil ===");
        if (terbesarkedua == Integer.MIN_VALUE) {
            System.out.println("tidak ada nilai terbesar kedua (semua eleman sama).");
        } else {
            System.out.println("nilai terbesar: " + terbesar);
            System.out.println("nilai terbesar kedua: " + terbesarkedua);
        }
        input.close();
    }
}
