package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.Engine;

public class Even {
    public static void isEven() {
        Engine.getGreeting();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.\n");

        int count = 0;
        int number;
        String correctAnswer = "";

        while (count < Engine.COUNTER_BORDER) {
            number = (int) (Math.random() * Engine.MULTIPLIER);

            String input = Engine.makeQuestion(String.valueOf(number));

            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (number % 2 == 0 && input.equals(correctAnswer)
                    || number % 2 != 0 && input.equals(correctAnswer)) {
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
