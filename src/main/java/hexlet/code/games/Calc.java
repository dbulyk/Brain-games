package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESC = "What is the result of the expression?";
    private static final char[] OPERATION = {'*', '+', '-'};
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 100;

    public static void runGame() {
        int count = 0;
        final int multiplierOperation = OPERATION.length;
        String[][] conditions = new String[Engine.ROUNDS_COUNT][2];

        while (count < Engine.ROUNDS_COUNT) {
            int number1 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
            int number2 = Utils.generateRandomNum(MIN_NUM, MAX_NUM);
            int operationNum = (int) (Math.random() * multiplierOperation);
            String answer = (number1 + " " + OPERATION[operationNum] + " "
                    + number2);

            conditions[count][0] = answer;
            conditions[count][1] = getCorrectAnswer(number1, number2, OPERATION[operationNum]);
            count++;
        }
        System.out.println(Engine.runGame(conditions, DESC));
    }
    private static String getCorrectAnswer(int num1, int num2, char operation) {
        String correctAnswer;
        switch (operation) {
            case '+' :
                correctAnswer = String.valueOf(num1 + num2);
                break;
            case '-' :
                correctAnswer = String.valueOf(num1 - num2);
                break;
            default :
                correctAnswer = String.valueOf(num1 * num2);
                break;
        }
        return correctAnswer;
    }
}
