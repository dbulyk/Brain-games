package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String DESC = "What number is missing in the progression?";
    public static void progression() {
        final int arrayLength = 10;
        String[] progress = new String[arrayLength];
        int count = 0;
        int number;
        int numberProgression;
        int missedNumber;
        String correctAnswer = "";
        StringBuilder question;
        String[][] conditions = new String[hexlet.code.Engine.ARRAY_SIZE][2];

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

            String input = question.toString().trim();
            conditions[count][0] = input;
            conditions[count][1] = correctAnswer;
            count++;
        }
        Engine.runGame(conditions, DESC);
    }
}
