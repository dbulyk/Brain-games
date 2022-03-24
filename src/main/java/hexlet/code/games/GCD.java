package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        System.out.println(Engine.runGame(roundsData, DESCRIPTION));
    }
    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
        int number2 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);

        String answer = number1 + " " + number2;
        roundData[0] = answer;
        roundData[1] = getCorrectDivider(number1, number2);
        return roundData;
    }

    public static String getCorrectDivider(int number1, int number2) {
        String correctDivider = "";
        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                correctDivider = String.valueOf(i);
            }
        }
        return correctDivider;
    }
}
