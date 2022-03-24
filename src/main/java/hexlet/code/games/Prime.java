package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.\n";
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
        int number = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
        String correctAnswer = isPrime(number) ? "yes" : "no";

        roundData[0] = String.valueOf(number);
        roundData[1] = correctAnswer;
        return roundData;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number != 0 && number != 1;
    }
}
