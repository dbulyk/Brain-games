package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        System.out.println(Engine.runGame(roundsData, DESCRIPTION));
    }

    public static String correctAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        }
        return "no";
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
        String correctAnswer = correctAnswer(number);

        roundData[0] = String.valueOf(number);
        roundData[1] = correctAnswer;
        return roundData;
    }
}
