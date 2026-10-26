class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor berparameter menggunakan 'this'
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
}

public class latihan1 {
    public static void main(String[] args) {
        // Membuat 2 object berbeda
        Buku b1 = new Buku("Pemrograman Java", "Budi", 2020);
        Buku b2 = new Buku("Struktur Data", "Siti", 2018);

        // Menampilkan data
        System.out.println(b1.judul + " - " + b1.pengarang + " (" + b1.tahunTerbit + ")");
        System.out.println(b2.judul + " - " + b2.pengarang + " (" + b2.tahunTerbit + ")");
    }
}