package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPERATIONS = {'*', '+', '-'};
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < roundsData.length; i++) {
            roundsData[i] = generateRoundData();
        }
        System.out.println(Engine.runGame(roundsData, DESCRIPTION));
    }

    private static int calculate(int num1, int num2, char operation) {
        int correctAnswer;
        switch (operation) {
            case '+' :
                correctAnswer = num1 + num2;
                break;
            case '-' :
                correctAnswer = num1 - num2;
                break;
            default :
                correctAnswer = num1 * num2;
                break;
        }
        return correctAnswer;
    }

    private static String[] generateRoundData() {
        String[] roundData = new String[2];
        int number1 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
        int number2 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);

        int operationNum = Utils.generateRandomNum(MIN_NUM, OPERATIONS.length);
        String question = (number1 + " " + OPERATIONS[operationNum] + " "
                + number2);
        roundData[0] = question;
        roundData[1] = String.valueOf(calculate(number1, number2, OPERATIONS[operationNum]));
        return roundData;
    }
}
