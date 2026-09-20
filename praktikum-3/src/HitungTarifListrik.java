import java.util.Scanner;

public class HitungTarifListrik {
    // Definisi tarif per kWh sebagai konstanta
    public static final int TARIF_450 = 415;
    public static final int TARIF_900 = 1352;
    public static final int TARIF_1300 = 1444;
    public static final int TARIF_2200 = 1444;
    public static final int TARIF_DI_ATAS_2200 = 1700;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("    PROGRAM HITUNG TARIF LISTRIK      ");
        System.out.println("=======================================");

        System.out.print("Masukkan Golongan Daya Listrik (450 / 900 / 1300 / 2200 / >2200): ");
        int daya = sc.nextInt();

        System.out.print("Masukkan Pemakaian Listrik (kWh): ");
        double kwh = sc.nextDouble();

        // Validasi input pemakaian listrik
        if (kwh <= 0) {
            System.out.println("\n[ERROR] Jumlah pemakaian kWh harus lebih besar dari nol!");
            return;
        }

        int tarifPerKwh = 0;
        boolean dayaValid = true;

        // Menentukan tarif berdasarkan daya listrik
        switch (daya) {
            case 450:
                tarifPerKwh = TARIF_450;
                break;
            case 900:
                tarifPerKwh = TARIF_900;
                break;
            case 1300:
                tarifPerKwh = TARIF_1300;
                break;
            case 2200:
                tarifPerKwh = TARIF_2200;
                break;
            default:
                if (daya > 2200) {
                    tarifPerKwh = TARIF_DI_ATAS_2200;
                } else {
                    System.out.println("\n[ERROR] Golongan daya listrik tidak valid!");
                    dayaValid = false;
                }
                break;
        }

        if (dayaValid) {
            double totalTagihan = kwh * tarifPerKwh;

            System.out.println("\n=======================================");
            System.out.println("           RINCIAN TAGIHAN            ");
            System.out.println("=======================================");
            System.out.println("Golongan Daya  : " + daya + " VA");
            System.out.println("Jumlah Pemakaian: " + kwh + " kWh");
            System.out.println("Tarif per kWh  : Rp " + tarifPerKwh);
            System.out.println("---------------------------------------");
            System.out.printf("Total Tagihan  : Rp %,.2f\n", totalTagihan);
            System.out.println("=======================================");
        }
    }
}