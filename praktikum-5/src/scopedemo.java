public class scopedemo {
    static void metodeA() {
        int x = 10; // milik metodeA
        System.out.println("di metodeA, x = " + x);
    }
    static void metodeB() {
        int x =99; // x milik metodeB, berbeda dari metodeA
        System.out.println("di metodeB, x = " + x);
    }
    public static void main(String[] args) {
        metodeA();
        metodeB();
    }
}
