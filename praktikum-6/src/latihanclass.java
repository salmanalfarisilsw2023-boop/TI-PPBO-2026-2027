public class latihanclass {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        mahasiswa m2 = new mahasiswa("Siti", "67890", 3.90);

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}
