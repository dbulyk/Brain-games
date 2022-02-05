package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static final int GET_GREETING = 1;
    public static final int IS_EVEN = 2;
    public static final int CALCULATE = 3;
    public static final int GCD_NUM = 4;
    public static final int PROGRESSION = 5;
    public static final int IS_PRIME = 6;
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
            case GET_GREETING :
                System.out.println("Welcome to the Brain Games!\n"
                        + "May I have your name?");
                String name = Engine.scanString();
                System.out.println("Hello, " + name + "!");
                break;
            case IS_EVEN :
                Even.isEven();
                break;
            case CALCULATE :
                Calc.calculate();
                break;
            case GCD_NUM :
                GCD.gcd();
                break;
            case PROGRESSION :
                Progression.progression();
                break;
            case IS_PRIME :
                Prime.isPrime();
                break;
            default :
                System.exit(0);
        }
    }
}
