package util;

public class MathUtil {

    // buat method untuk menghitung total

    public static int sum(int... values) {
        int total = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }
}
