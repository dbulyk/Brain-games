package app.src.main.java.hexlet.code;

import app.src.main.java.hexlet.code.games.Calc;
import app.src.main.java.hexlet.code.games.Even;
import app.src.main.java.hexlet.code.games.GCD;

public class App {
    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit""");

        int gameNum = Engine.scanInt();

        switch (gameNum) {
            case 1 -> Engine.getGreeting();
            case 2 -> Even.isEven();
            case 3 -> Calc.calculate();
            case 4 -> GCD.gcd();
            default -> System.exit(0);
        }
    }
}
