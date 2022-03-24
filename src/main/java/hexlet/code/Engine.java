package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MULTIPLIER = 100;

    public static String runGame(String[][] roundsData, String gameDescription) {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);

        for (String[] roundsDatum : roundsData) {
            String question = roundsDatum[0];
            String correctAnswer = roundsDatum[1];

            System.out.println("Question: " + question + "\n"
                    + "Your answer: ");
            String userAnswer = sc.nextLine();
            System.out.println(userAnswer);

            if (!userAnswer.equals(correctAnswer)) {
                return "'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'." + " Let's try again, " + name + "!";

            }
            System.out.println("Correct!");
        }
        sc.close();
        return "Congratulations, " + name + "!";
    }

}
