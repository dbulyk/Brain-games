package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final String DESC = "What is the result of the expression?";
    public static void calculate() {
        int number1;
        int number2;
        int operationNum;
        int count = 0;
        char[] operation = {'*', '+', '-'};
        final int multiplierOperation = operation.length;
        String[][] conditions = new String[Engine.ARRAY_SIZE][2];
        String correctAnswer;
        while (count < Engine.COUNTER_BORDER) {
            number1 = (int) (Math.random() * Engine.MULTIPLIER);
            number2 = (int) (Math.random() * Engine.MULTIPLIER);
            operationNum = (int) (Math.random() * multiplierOperation);
            String answer = (number1 + " " + operation[operationNum] + " "
                    + number2);

            switch (operationNum) {
                case 1 :
                    correctAnswer = String.valueOf(number1 + number2);
                    break;
                case 2 :
                    correctAnswer = String.valueOf(number1 - number2);
                    break;
                default :
                    correctAnswer = String.valueOf(number1 * number2);
                    break;
            }
            conditions[count][0] = answer;
            conditions[count][1] = correctAnswer;
            count++;
        }
        Engine.runGame(conditions, DESC);
    }
}
