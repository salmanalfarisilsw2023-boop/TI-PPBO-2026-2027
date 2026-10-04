import java.util.Scanner;

public class pengolahannilaikelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int kkm = 70;

        System.out.println("========================================================");
        System.out.println("       program pengolah nilai kelas mahasiswa           ");
        System.out.println("========================================================");

        System.out.print("masukkan jumlah mahasiswa (n): ");
        int n = input.nextInt();

        while (n <= 0) {
            System.out.print("jumlah mahasiswa harus lebih dari 0. masukkan kembali");
            n = input.nextInt();
        }
        int[] nilai = new int[n];
        int[] nilaisebelumsort = new int[n];

        System.out.println("\n--- input nilai mahasiswa ---");
        for (int i = 0; i < n; i++) {
            System.out.print("masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            nilaisebelumsort[i] = nilai[i];
        }
        int total = 0;
        int tertingggi = nilai[0];
        int terendah = nilai[0];
        int jumlahlulus = 0;
        int jumlahtidaklulus =0;

        for (int i = 0; i < n; i++) {
            int currentnilai = nilai[i];
            total += currentnilai;
            if (currentnilai > tertingggi) {
                tertingggi = currentnilai;
            }
            if (currentnilai < terendah) {
                terendah = currentnilai;
            }
            if (currentnilai >= kkm) {
                jumlahlulus++;
            } else {
                jumlahtidaklulus++;
            }
        }
        double ratarata = (double) total / n;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
        System.out.println("\n==================================================");
        System.out.println("             laporan hasil olahan nilai             ");
        System.out.println("====================================================");
        System.out.println("jumlah mahasiswa      : " + n + " orang");
        System.out.println("batas kkm kelulusa    : " + kkm);
        System.out.println("----------------------------------------------------");
        System.out.printf("nilai rata-rata kelas : %.2f\n", ratarata);
        System.out.println("nilai tertinggi       : " + tertingggi);
        System.out.println("nilai terendah        : " + terendah);
        System.out.println("jumlah lulus          : " + jumlahlulus + " mahasiswa");
        System.out.println("jumlah tidak lulus    : " + jumlahtidaklulus + " mahasiswa");
        System.out.println("----------------------------------------------------");

        System.out.print("nilai sebelum diurutkan: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaisebelumsort[i] + (i < n - 1 ? ", " : " "));
        }
        System.out.println("]");

        System.out.print("nilai sesudah diurutkan: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + (i < n - 1 ? ", " : " "));
        }
        System.out.println("]");
        System.out.println("====================================================");

        input.close();
    }
}
