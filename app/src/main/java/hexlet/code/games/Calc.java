package app.src.main.java.hexlet.code.games;

import app.src.main.java.hexlet.code.Engine;

public class Calc {
    public static void calculate() {
        Engine.getGreeting();
        System.out.println("What is the result of the expression?");

        char[] operation = {'*', '+', '-'};
        final int multiplierOperation = operation.length;
        int count = 0;
        String correctAnswer = "";
        int number1;
        int number2;
        int operationNum;

        while (count < Engine.COUNTER_BORDER) {
            number1 = (int) (Math.random() * Engine.MULTIPLIER);
            number2 = (int) (Math.random() * Engine.MULTIPLIER);
            operationNum = (int) (Math.random() * multiplierOperation);

            String input = Engine.makeQuestion((number1 + " " + operation[operationNum] + " "
                    + number2));

            correctAnswer = switch (operationNum) {
                case 1 -> String.valueOf(number1 + number2);
                case 2 -> String.valueOf(number1 - number2);
                default -> String.valueOf(number1 * number2);
            };
            if (input.equals(correctAnswer)) {
                Engine.correctAnswer();
            } else {
                Engine.incorrectAnswer(input, correctAnswer);
            }
            count++;
        }
        Engine.congrats();
        System.exit(0);
    }
}
