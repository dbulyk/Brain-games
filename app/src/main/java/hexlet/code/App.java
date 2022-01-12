package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();

        switch (gameNum) {
            case 1:
                System.out.println(getGreeting());
                break;
            case 2:
                Even.isEven();
                break;
            default:
                System.exit(0);
        }
    }


    public static String getGreeting() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        String greeting = "Hello, " + Cli.getName() + "!";
        return greeting;
    }
}
