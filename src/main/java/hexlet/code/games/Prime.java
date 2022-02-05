package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String DESC = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";
    public static void isPrime() {
        int number;
        int count = 0;
        String correctAnswer;
        String[][] conditions = new String[Engine.ARRAY_SIZE][2];
        while (count < Engine.COUNTER_BORDER) {
            number = (int) (Math.random() * Engine.MULTIPLIER);
            correctAnswer = "yes";
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
        Engine.runGame(conditions, DESC);
    }
}
