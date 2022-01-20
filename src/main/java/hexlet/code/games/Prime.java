package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void isPrime() {
        Engine.getGreeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.\n");

        int count = 0;
        int number;
        String correctAnswer;

        while (count < Engine.COUNTER_BORDER) {
            number = (int) (Math.random() * Engine.MULTIPLIER);
            String input = Engine.makeQuestion(String.valueOf(number));
            correctAnswer = "yes";

            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    correctAnswer = "no";
                }
            }

            if (number == 0 || number == 1) {
                correctAnswer = "no";
            }

            if (input.equals(correctAnswer)) {
                Engine.correctAnswer();
            } else {
                Engine.incorrectAnswer(input, correctAnswer);
            }
            count++;
        }
        Engine.congrats();
        System.exit(0);
    }
}
