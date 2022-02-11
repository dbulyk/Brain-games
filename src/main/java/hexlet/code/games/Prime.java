package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESC = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        int count = 0;
        String[][] conditions = new String[Engine.ROUNDS_COUNT][2];
        while (count < Engine.ROUNDS_COUNT) {
            int number = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
            String correctAnswer = "yes";
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    correctAnswer = "no";
                    break;
                }
            }

            if (number == 0 || number == 1) {
                correctAnswer = "no";
            }
            conditions[count][0] = String.valueOf(number);
            conditions[count][1] = correctAnswer;
            count++;
        }
        System.out.println(Engine.runGame(conditions, DESC));
    }
}
