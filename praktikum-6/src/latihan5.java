public class latihan5 {
    public static void main(String[] args) {
        // Array of Objects minimal 4 ukuran berbeda
        Persegi[] daftarPersegi = {
                new Persegi(3.0),
                new Persegi(8.0),
                new Persegi(5.5),
                new Persegi(2.0)
        };

        // Algoritma pencarian nilai maksimum
        Persegi terbesar = daftarPersegi[0];

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = daftarPersegi[i];
            }
        }

        System.out.println("Persegi dengan luas TERBESAR:");
        System.out.println("Sisi: " + terbesar.sisi + " | Luas: " + terbesar.hitungLuas());
    }
}