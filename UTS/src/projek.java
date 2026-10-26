import java.util.Scanner;

public class projek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama: ");
        String nama = scanner.nextLine();

        double[] harga = new double[3];
        for (int i = 0; i < harga.length; i++) {
            System.out.print("masukkan harga barang " + (i + 1) + ": ");
            harga[i] = scanner.nextDouble();
        }
        double totalbelanja = 0;
        for (int i = 0; i < harga.length; i++) {
            totalbelanja += harga[i];
        }
        int diskonpersen = 0;
        if (totalbelanja >= 500000) {
            diskonpersen = 20;
        } else if (totalbelanja >= 200000) {
            diskonpersen = 10;
        } else if (totalbelanja >= 100000) {
            diskonpersen = 5;
        } else {
            diskonpersen = 0;
        }
        double jumlahdiskon = totalbelanja * (diskonpersen / 100.0);
        double totalbayar = totalbelanja - jumlahdiskon;

        System.out.println(" - hasil -");
        System.out.println("nama: " + nama);
        System.out.println("total belanja: " +totalbelanja);
        System.out.println("diskon: " + diskonpersen + "%");
        System.out.println("total bayar: " + totalbayar);

        scanner.close();
    }
}
