package app.src.main.java.hexlet.code;

import java.util.Scanner;
import app.src.main.java.hexlet.code.games.Calc;
import app.src.main.java.hexlet.code.games.Even;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int gameNum = scanner.nextInt();

        switch (gameNum) {
            case 1:
                Engine.getGreeting();
                break;
            case 2:
                Even.isEven();
                break;
            case 3:
                Calc.calculate();
                break;
            default:
                System.exit(0);
        }
    }
}
