import java.util.Scanner;

public class latihan4 {
    static int carinilaiminimun(int[] data) {
        int min = data[0];
        for (int nilai : data) {
            if (nilai < min) min = nilai;
        }
        return min;
    }
    static int carinilaimaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) max = nilai;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan jumlah data ujian: ");
        int n = scanner.nextInt();

        int[] nilaiujian = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("masukkan nilai ke-" + (i + 1) + ": ");
            nilaiujian[i] = scanner.nextInt();
        }
        System.out.println("nilai minimum : " + carinilaimaksimum(nilaiujian));
        System.out.println("nilai maksimum : " + carinilaiminimun(nilaiujian));
    }
}
