public class TokoDemo {
    public static void main(String[] args) {
        ProdukS[] daftarProduk = {
                new ProdukS("P01", "Laptop LOQ", 15000000.0, 5),
                new ProdukS("P02", "Mouse Wireless", 150000.0, 10),
                new ProdukS("P03", "Keyboard Mekanikal", 450000.0, 3),
                new ProdukS("P04", "Monitor 24 inch", 1800000.0, 2),
                new ProdukS("P05", "Headset Gaming", 350000.0, 8)
        };

        System.out.println("=== DAFTAR PRODUK TOKO ===");
        for (ProdukS p : daftarProduk) {
            p.tampilkanData();
        }
        System.out.println("\n=== SIMULASI PEMBELIAN ===");
        System.out.println("1. Membeli 2 unit " + daftarProduk[1].namaProduk + "...");
        System.out.println("Total Harga: Rp" + daftarProduk[1].hitungTotalHarga(2));
        daftarProduk[1].kurangiStok(2);

        System.out.println();
        System.out.println("2. Membeli 5 unit " + daftarProduk[3].namaProduk + "... (Stok tersedia: " + daftarProduk[3].stok + ")");
        System.out.println("Total Harga: Rp" + daftarProduk[3].hitungTotalHarga(5));
        daftarProduk[3].kurangiStok(5);

        System.out.println("\n=== PRODUK TERMAHAL ===");
        ProdukS termahal = daftarProduk[0];
        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > termahal.harga) {
                termahal = daftarProduk[i];
            }
        }
        System.out.println("Produk termahal adalah:");
        termahal.tampilkanData();
    }
}