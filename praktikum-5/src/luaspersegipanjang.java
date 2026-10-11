public class luaspersegipanjang {
    static double luaspersegipanjang(double p, double l) {
        return p * l;
    }
    static double luaslingkaran(double r) {
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        System.out.println("luar persegi panjang (10, 5)  : " + luaspersegipanjang(10, 5));
        System.out.println("luas persegi panjang (7.5, 4) : " + luaspersegipanjang(7.5, 4));
        System.out.println("luas lingkaran (r = 7)        : " + luaslingkaran(7));
        System.out.println("luas lingkaran (r = 10)       : " + luaslingkaran(10));
    }
}
