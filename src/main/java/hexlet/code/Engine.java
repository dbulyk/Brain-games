package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNTER_BORDER = 3;
    public static final int ARRAY_SIZE = 3;
    public static final int MULTIPLIER = 100;

    public static void runGame(String[][] cond, String gameDescription) {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        String name = scanString();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);

        String input;

        for (int i = 0; i < COUNTER_BORDER; i++) {
            System.out.println("Question: " + cond[i][0]);
            input = scanString();
            System.out.println("Your answer: " + input);

            if (input.equals(cond[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + input + "' is wrong answer ;(. Correct answer was '"
                        + cond[i][1] + "'." + " Let's try again, " + name + "!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + name + "!");
        System.exit(0);
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
