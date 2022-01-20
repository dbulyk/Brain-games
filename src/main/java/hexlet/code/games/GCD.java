package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcd() {
        Engine.getGreeting();
        System.out.println("Find the greatest common divisor of given numbers.");

        int count = 0;
        String correctDivider = "";
        int number1;
        int number2;
        while (count < Engine.COUNTER_BORDER) {
            number1 = (int) (Math.random() * Engine.MULTIPLIER);
            number2 = (int) (Math.random() * Engine.MULTIPLIER);

            for (int i = 1; i <= Math.min(number1, number2); i++) {
                if (number1 % i == 0 && number2 % i == 0) {
                    correctDivider = String.valueOf(i);
                }
            }

            String input = Engine.makeQuestion(number1 + " " + number2);
            if (input.equals(correctDivider)) {
                Engine.correctAnswer();
            } else {
                Engine.incorrectAnswer(input, correctDivider);
            }
            count++;
        }
        Engine.congrats();
    }
}
