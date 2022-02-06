package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String DESC = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void isEven() {
        int count = 0;
        int number;
        String correctAnswer;
        String[][] conditions = new String[Engine.ARRAY_SIZE][2];

        while (count < Engine.COUNTER_BORDER) {
            number = (int) (Math.random() * Engine.MULTIPLIER);
            correctAnswer = correctAnswer(number);

            conditions[count][0] = String.valueOf(number);
            conditions[count][1] = correctAnswer;
            count++;
        }
        Engine.runGame(conditions, DESC);
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
