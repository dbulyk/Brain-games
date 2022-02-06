package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final String DESC = "What number is missing in the progression?";
    private static String correctAnswer = "";
    public static void progression() {
        final int arrayLength = 10;
        int count = 0;
        int number;
        int stepProgression;
        String[] progress;
        StringBuilder question;
        String[][] conditions = new String[Engine.ARRAY_SIZE][2];

        while (count < Engine.COUNTER_BORDER) {
            question = new StringBuilder();
            number = (int) (Math.random() * Engine.MULTIPLIER);
            stepProgression = number;

            progress = makeProgression(number, stepProgression, arrayLength);

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

    public static String[] makeProgression(int number, int stepProgression, int progressLength) {
        int missedNumber;
        String[] progress = new String[progressLength];
        missedNumber = (int) (Math.random() * progressLength);

        for (int i = 0; i < progressLength; i++) {
            if (i != missedNumber) {
                progress[i] = String.valueOf(number + stepProgression);
            } else {
                progress[i] = "..";
                correctAnswer = String.valueOf(number + stepProgression);
            }
            number += stepProgression;
        }
        return progress;
    }
}
