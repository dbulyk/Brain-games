package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String DESC = "What number is missing in the runGame?";
    private static String correctAnswer = "";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;


    public static void runGame() {
        final int arrayLength = 10;
        int count = 0;
        String[][] conditions = new String[Engine.ROUNDS_COUNT][2];

        while (count < Engine.ROUNDS_COUNT) {
            StringBuilder question = new StringBuilder();
            int number = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
            int stepProgression = number;

            String[] progress = makeProgression(number, stepProgression, arrayLength);

            for (String num : progress) {
                question.append(num).append(" ");
            }

            String input = question.toString().trim();
            conditions[count][0] = input;
            conditions[count][1] = correctAnswer;
            count++;
        }
        System.out.println(Engine.runGame(conditions, DESC));
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
