class mahasiswa {
    String nama;
    String nim;
    double ipk;

    public mahasiswa() {
        nama = "belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    public mahasiswa(String namaAwal, String nimawal, double ipkawal) {
        nama = namaAwal;
        nim = nimawal;
        ipk = ipkawal;
    }
}