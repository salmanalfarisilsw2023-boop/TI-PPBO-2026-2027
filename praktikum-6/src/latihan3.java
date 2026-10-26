class produk {
    String namaProduk;
    double harga;

    public produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method mengecek apakah harga melebihi batasHarga
    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }
}

public class latihan3 {
    public static void main(String[] args) {
        produk p1 = new produk("Laptop LOQ", 15000000);

        double batas = 10000000;
        System.out.println("Apakah " + p1.namaProduk + " mahal (di atas " + batas + ")? " + p1.isMahal(batas));
    }
}