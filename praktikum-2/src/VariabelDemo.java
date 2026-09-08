public class VariabelDemo {
    public static void main(String[] args) {
        String nama = "siti";
        int umur = 20;
        double tinggi = 165.5;
        char golDarah = 'O';
        boolean mahasiswaAktif = true;

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Golongan Darah: " + golDarah);
        System.out.println("Aktif:" + mahasiswaAktif);
        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; // windening otomatis
        System.out.println("Windenin: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; // narrowing ekplisit
        System.out.println("Narrowing: " + hasilCasting);
    }
}
