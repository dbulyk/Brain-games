package hexlet.code;

public class Utils {
    public static int generateRandomNum(int min, int max) {
        return min + (int) (Math.random() * max);
    }
}
