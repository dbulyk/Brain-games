package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String DESCRIPTION = "What number is missing in the runGame?";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        System.out.println(Engine.runGame(roundsData, DESCRIPTION));
    }

    public static int[] makeProgression(int number, int stepProgression, int progressLength) {
        int[] progression = new int[progressLength];
        for (int i = 0; i < progressLength; i++) {
            progression[i] = number + stepProgression;
            number += stepProgression;
        }
        return progression;
    }

    private static String[] generateRoundData() {
        final int arrayLength = 10;
        String[] roundData = new String[2];
        StringBuilder question = new StringBuilder();
        int number = Utils.generateRandomNum(MIN_NUM, MAX_NUM);

        int[] progression = makeProgression(number, number, arrayLength);
        int indexOfMissingNum = Utils.generateRandomNum(MIN_NUM, arrayLength);
        int missingNum = progression[indexOfMissingNum];

        for (int num : progression) {
            if (num == missingNum) {
                question.append("..").append(" ");
                continue;
            }
            question.append(num).append(" ");
        }

        String input = question.toString().trim();
        roundData[0] = input;
        roundData[1] = String.valueOf(missingNum);
        return roundData;
    }
}
