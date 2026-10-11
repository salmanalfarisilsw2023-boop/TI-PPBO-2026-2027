import java.util.Arrays;

public class latihan5 {
    static int hitungtotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }
    static int[] filterdiatasratarata(int[] data) {
        double ratarata = (double) hitungtotal(data) / data.length;

        int count = 0;
        for (int nilai : data) {
            if (nilai > ratarata) count++;
        }
        int[] hasil = new int[count];
        int index = 0;
        for (int nilai : data) {
            if (nilai > ratarata) {
                hasil[index++] = nilai;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        int[] data = {60, 75, 80, 90, 85, 50};

        int total = hitungtotal(data);
        double avg = (double) total / data.length;
        int[] diatasratarata = filterdiatasratarata(data);

        System.out.println("data              : " + Arrays.toString(data));
        System.out.println("total             : " + total);
        System.out.println("rata-rata         : " + avg);
        System.out.println("di atas rata-rata : " + Arrays.toString(diatasratarata));
    }
}
