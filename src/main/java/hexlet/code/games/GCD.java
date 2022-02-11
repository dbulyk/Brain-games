package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String DESC = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        int count = 0;
        String correctDivider = "";
        String[][] conditions = new String[Engine.ROUNDS_COUNT][2];
        while (count < Engine.ROUNDS_COUNT) {
            int number1 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
            int number2 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);

            for (int i = 1; i <= Math.min(number1, number2); i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    correctDivider = String.valueOf(i);
                }
            }

            String answer = number1 + " " + number2;
            conditions[count][0] = answer;
            conditions[count][1] = correctDivider;
            count++;
        }
        System.out.println(Engine.runGame(conditions, DESC));
    }
}
