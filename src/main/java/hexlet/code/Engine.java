package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MULTIPLIER = 100;

    public static String runGame(String[][] cond, String gameDescription) {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        String name = scanString();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = cond[i][0];
            String correctAnswer = cond[i][1];

            System.out.println("Question: " + question + "\n"
                    + "Your answer: ");
            String userAnswer = scanString();
            System.out.println(userAnswer);

            if (!userAnswer.equals(correctAnswer)) {
                return "'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'." + " Let's try again, " + name + "!";

            }
            System.out.println("Correct!");
        }
        return "Congratulations, " + name + "!";
    }

    public static String scanString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
