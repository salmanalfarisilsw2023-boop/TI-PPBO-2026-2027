public class operatorDemo {
    public static void main(String[] args) {
       int a = 17, b = 5;
       System.out.println("jumlah: " + (a + b));
        System.out.println("selisih: " + (a - b));
        System.out.println("kali: " + (a * b));
        System.out.println("bagi: " + (a / b));
        System.out.println("sisa bagi: " + (a % b));
        int nilaiUjian = 80;
        boolean hadir = true;
        System.out.println("lulus (>=75): " + (nilaiUjian >=75));
        System.out.println("lulus dan hadir: " + (nilaiUjian >=75 && hadir));
    }
}
