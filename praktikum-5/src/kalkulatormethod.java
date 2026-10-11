import java.util.ArrayList;
import java.util.Scanner;

public class kalkulatormethod {

    // Method Operasi Matematika
    static double tambah(double a, double b) {
        return a + b;
    }

    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    static double kurang(double a, double b) {
        return a - b;
    }

    static double kali(double a, double b) {
        return a * b;
    }

    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return Double.NaN;
        }
        return a / b;
    }

    static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    static double akarKuadrat(double angka) {
        if (angka < 0) {
            System.out.println("Error: Akar kuadrat dari bilangan negatif tidak valid!");
            return Double.NaN;
        }
        return Math.sqrt(angka);
    }

    static double riwayatKeMaksimum(double[] riwayatHasil) {
        if (riwayatHasil.length == 0) return Double.NaN;
        double max = riwayatHasil[0];
        for (double hasil : riwayatHasil) {
            if (hasil > max) max = hasil;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listRiwayat = new ArrayList<>();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n========== MENU KALKULATOR ==========");
            System.out.println("1. Penjumlahan (2 Angka)");
            System.out.println("2. Penjumlahan (3 Angka)");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Perpangkatan");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar Program");
            System.out.print("Pilih menu (1-8): ");

            int pilihan = scanner.nextInt();
            double hasil = Double.NaN;

            switch (pilihan) {
                case 1:
                    System.out.print("Angka 1: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Angka 2: ");
                    double b1 = scanner.nextDouble();
                    hasil = tambah(a1, b1);
                    System.out.println("Hasil: " + hasil);
                    break;
                case 2:
                    System.out.print("Angka 1: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Angka 2: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Angka 3: ");
                    double c2 = scanner.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    System.out.println("Hasil: " + hasil);
                    break;
                case 3:
                    System.out.print("Angka 1: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Angka 2: ");
                    double b3 = scanner.nextDouble();
                    hasil = kurang(a3, b3);
                    System.out.println("Hasil: " + hasil);
                    break;
                case 4:
                    System.out.print("Angka 1: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Angka 2: ");
                    double b4 = scanner.nextDouble();
                    hasil = kali(a4, b4);
                    System.out.println("Hasil: " + hasil);
                    break;
                case 5:
                    System.out.print("Angka 1: ");
                    double a5 = scanner.nextDouble();
                    System.out.print("Angka 2: ");
                    double b5 = scanner.nextDouble();
                    hasil = bagi(a5, b5);
                    if (!Double.isNaN(hasil)) System.out.println("Hasil: " + hasil);
                    break;
                case 6:
                    System.out.print("Basis: ");
                    double basis = scanner.nextDouble();
                    System.out.print("Eksponen: ");
                    double eksponen = scanner.nextDouble();
                    hasil = pangkat(basis, eksponen);
                    System.out.println("Hasil: " + hasil);
                    break;
                case 7:
                    System.out.print("Angka: ");
                    double angka = scanner.nextDouble();
                    hasil = akarKuadrat(angka);
                    if (!Double.isNaN(hasil)) System.out.println("Hasil: " + hasil);
                    break;
                case 8:
                    berjalan = false;
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            if (!Double.isNaN(hasil)) {
                listRiwayat.add(hasil);
            }
        }

        if (!listRiwayat.isEmpty()) {
            double[] arrayRiwayat = new double[listRiwayat.size()];
            for (int i = 0; i < listRiwayat.size(); i++) {
                arrayRiwayat[i] = listRiwayat.get(i);
            }
            System.out.println("Nilai hasil terbesar dari riwayat: " + riwayatKeMaksimum(arrayRiwayat));
        }

        scanner.close();
    }
}