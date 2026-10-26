public class latihan4 {
    public static void main(String[] args) {
        // Array of Objects minimal 4 buku
        Buku[] daftarBuku = {
                new Buku("Java Dasar", "Andi", 2012),
                new Buku("Algoritma Lanjut", "Budi", 2018),
                new Buku("Basis Data SQL", "Cici", 2014),
                new Buku("Kecerdasan Buatan", "Dodi", 2021)
        };

        System.out.println("Buku terbit setelah tahun 2015:");
        for (Buku b : daftarBuku) {
            if (b.tahunTerbit > 2015) {
                System.out.println("- " + b.judul + " (" + b.tahunTerbit + ")");
            }
        }
    }
}