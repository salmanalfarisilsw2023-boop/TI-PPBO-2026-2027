public class methodarraydemo {
    static double hitungratarata(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return (double) total / data.length;
    }
    static int carimaksimum(int[] data) {
        int max = data[0];
        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nilaiujian = {80, 75, 90, 60, 88};

        System.out.println("rata-rata: " + hitungratarata(nilaiujian));
        System.out.println("maksimun: " + carimaksimum(nilaiujian));
    }
}
