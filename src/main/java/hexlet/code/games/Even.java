package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String DESC = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        int count = 0;
        String[][] conditions = new String[Engine.ROUNDS_COUNT][2];

        while (count < Engine.ROUNDS_COUNT) {
            int number = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
            String correctAnswer = correctAnswer(number);

            conditions[count][0] = String.valueOf(number);
            conditions[count][1] = correctAnswer;
            count++;
        }
        System.out.println(Engine.runGame(conditions, DESC));
    }

    public static String correctAnswer(int number) {
        String correctAnswer;

        if (number % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }

        return correctAnswer;
    }
}
