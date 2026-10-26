class Persegi {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(4.0);
        Persegi p2 = new Persegi(7.5);

        System.out.println("Persegi 1 (sisi " + p1.sisi + ") -> Luas: " + p1.hitungLuas() + ", Keliling: " + p1.hitungKeliling());
        System.out.println("Persegi 2 (sisi " + p2.sisi + ") -> Luas: " + p2.hitungLuas() + ", Keliling: " + p2.hitungKeliling());
    }
}