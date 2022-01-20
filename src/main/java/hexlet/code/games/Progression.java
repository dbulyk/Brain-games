package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progression() {
        final int arrayLength = 10;
        Engine.getGreeting();
        System.out.println("What number is missing in the progression?");

        String[] progress = new String[arrayLength];
        int count = 0;
        int number;
        int numberProgression;
        int missedNumber;
        String correctAnswer = "";
        StringBuilder question;

        while (count < Engine.COUNTER_BORDER) {
            question = new StringBuilder();
            missedNumber = (int) (Math.random() * progress.length);
            number = (int) (Math.random() * Engine.MULTIPLIER);
            numberProgression = number;

            for (int i = 0; i < progress.length; i++) {
                if (i != missedNumber) {
                    progress[i] = String.valueOf(number + numberProgression);
                } else {
                    progress[i] = "..";
                    correctAnswer = String.valueOf(number + numberProgression);
                }
                number += numberProgression;
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
