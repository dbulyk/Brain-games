package app.src.main.java.hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNTER_BORDER = 3;
    public static final int MULTIPLIER = 100;
    private static String name;

    public static void getGreeting() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        name = Cli.getName();
        System.out.println("Hello, " + name + "!");
    }

    public static void correctAnswer() {
        System.out.println("Correct!");
    }

    public static void incorrectAnswer(String answer, String correctAnswer) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'."
                + " Let's try again, " + name + "!");
        System.exit(0);
    }

    public static String makeQuestion(String question) {
        System.out.println("Question: " + question);
        String input = scanString();
        System.out.println("Your answer: " + input);
        return input;
    }

    public static void congrats() {
        System.out.println("Congratulations, " + name + "!");
        System.exit(0);
    }

    public static String scanString() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    public static int scanInt() {
        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();
        return gameNum;
    }
}
