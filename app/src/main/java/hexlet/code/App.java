package app.src.main.java.hexlet.code;

import app.src.main.java.hexlet.code.games.Calc;
import app.src.main.java.hexlet.code.games.Even;
import app.src.main.java.hexlet.code.games.GCD;
import app.src.main.java.hexlet.code.games.Progression;
import app.src.main.java.hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                           + "1 - Greet\n"
                           + "2 - Even\n"
                           + "3 - Calc\n"
                           + "4 - GCD\n"
                           + "5 - Progression\n"
                           + "6 - Prime\n"
                           + "0 - Exit");

        int gameNum = Engine.scanInt();

        switch (gameNum) {
            case Engine.GET_GREETING -> Engine.getGreeting();
            case Engine.IS_EVEN -> Even.isEven();
            case Engine.CALCULATE -> Calc.calculate();
            case Engine.GCD -> GCD.gcd();
            case Engine.PROGRESSION -> Progression.progression();
            case Engine.IS_PRIME -> Prime.isPrime();
            default -> System.exit(0);
        }
    }
}
