public class daftarmahasiswa {
    public static void main ( String [] args ) {
        mahasiswa [] daftar = new mahasiswa [ 3];

        daftar [ 0] = new mahasiswa ( "Budi" , "111" , 3.2 );
        daftar [ 1] = new mahasiswa ( "Siti" , "222" , 3.8 );
        daftar [ 2] = new mahasiswa ( "Andi" , "333" , 3.6 );

        for ( mahasiswa m : daftar ) {
            m.tampilkanData ();
            System . out . println ( " --- " );
        }
        int jumlahCumlaude = 0;
        for ( mahasiswa m : daftar ) {
            if ( m. isCumlaude ()) {
                jumlahCumlaude ++;
                }
            }
        System . out . println ( "Jumlah mahasiswa cumlaude: " + jumlahCumlaude );
    }
}
