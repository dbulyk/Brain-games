package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
            case Engine.GET_GREETING :
                Engine.getGreeting();
                break;
            case Engine.IS_EVEN :
                Even.isEven();

            case Engine.CALCULATE :
                Calc.calculate();
                break;
            case Engine.GCD :
                GCD.gcd();
                break;
            case Engine.PROGRESSION :
                Progression.progression();
                break;
            case Engine.IS_PRIME :
                Prime.isPrime();
                break;
            default :
                System.exit(0);
        }
    }
}
