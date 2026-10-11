public class latihan3 {
    static double konversisuhu(double celcius) {
        return (celcius * 9 / 5) + 32;
    }
    static double konversisuhu(double  celsius, String skalatujuan) {
        if (skalatujuan.equalsIgnoreCase("kelvin")) {
            return celsius + 273.15;
        } else if (skalatujuan.equalsIgnoreCase("fahrenheit")) {
            return konversisuhu(celsius);
        } else {
            System.out.println("skala tidak dikenal!");
            return celsius;
        }
    }
    public static void main(String[] args) {
        System.out.println("100 C -> fahrenheit : " + konversisuhu(100));
        System.out.println("100 C -> kelvin     :" + konversisuhu(100, "kelvin"));
        System.out.println("100 C -> fahrenheit : " + konversisuhu(100, "fahrenheit"));
    }
}
