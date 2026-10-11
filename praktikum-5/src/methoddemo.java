public class methoddemo {
    // method void: tidak mengembalikan nilai apa pun
    static void tampilkanbiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }
    public static void main(String[] args) {
        // panggil pada method main:
        tampilkanbiodata("budi", 20, "bandung");
    }
}
