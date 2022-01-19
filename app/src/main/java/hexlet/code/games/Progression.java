package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.Engine;

public class Progression {
    public static void progression() {
        Engine.getGreeting();
        System.out.println("What number is missing in the progression?");

        String[] progress = new String[10];
        int count = 0;
        int number;
        int missedNumber;
        String correctAnswer = "";
        StringBuilder question;

        while (count < Engine.COUNTER_BORDER) {
            question = new StringBuilder();
            missedNumber = (int) (Math.random() * progress.length);
            number = (int) (Math.random() * Engine.MULTIPLIER);

            for (int i = 0; i < progress.length; i++) {
                if (i != missedNumber) {
                    progress[i] = String.valueOf(number);
                } else {
                    progress[i] = "..";
                    correctAnswer = String.valueOf(number);
                }
                number += number;
            }

            for (String num : progress) {
                question.append(num).append(" ");
            }

            String input = Engine.makeQuestion(question.toString().trim());
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
