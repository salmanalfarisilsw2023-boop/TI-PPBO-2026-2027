public class returndemo {
    static int tambah(int a, int b) {
        return a + b;
    }
    static boolean isgenap(int angka) {
        return angka % 2 == 0;
    }
    public static void main(String[] args) {
        int hasil = tambah(15, 17);
        System.out.println("hasil tambah: " + hasil);
        System.out.println("apakah 8 genap? " + isgenap(8));
        System.out.println("apakah 7 genap? " + isgenap(7));
    }
}
