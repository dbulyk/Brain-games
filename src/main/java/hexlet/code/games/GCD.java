package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final String DESC = "Find the greatest common divisor of given numbers.";
    public static void gcd() {
        int count = 0;
        String correctDivider = "";
        int number1;
        int number2;
        String[][] conditions = new String[Engine.ARRAY_SIZE][2];
        while (count < Engine.COUNTER_BORDER) {
            number1 = (int) (Math.random() * Engine.MULTIPLIER);
            number2 = (int) (Math.random() * Engine.MULTIPLIER);

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
        Engine.runGame(conditions, DESC);
    }
}
