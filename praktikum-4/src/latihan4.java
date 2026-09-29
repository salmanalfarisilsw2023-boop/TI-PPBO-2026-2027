import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int[3][3];
        int totalseluruh = 0;

        System.out.println("masukkan elemen matriks 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("matriks [" + i + "][" +  j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }
        System.out.println("\n=== hasil penjumlahan per baris ===");
        for (int i = 0; i < 3; i++) {
            int totalbaris = 0;
            for (int j = 0; j < 3; j++) {
                totalbaris +=  matriks[i][j];
                totalseluruh += matriks[i][j];
            }
            System.out.println("jumlah elemen baris ke-" + (i + 1) + ": " + totalbaris);
        }
        System.out.println("\ntotal seluruh elemen matriks: " + totalseluruh);

        input.close();
    }
}
