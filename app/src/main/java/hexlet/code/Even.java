package hexlet.code;

public class Even {
    public static void isEven() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        String name = Cli.getName();
        String greeting = "Hello, " + name + "!";
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.\n");

        final int multiplier = 100;
        final int counterBorder = 3;
        int count = 0;
        int number;

        while (count < counterBorder) {
            number = (int) (Math.random() * multiplier);

            System.out.println("Question: " + number);
            String input = Scan.scan();
            System.out.println("Your answer: " + input);

            String correctAnswer = "";
            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (number % 2 == 0 && input.equals(correctAnswer)
                    || number % 2 != 0 && input.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(input + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'."
                        + " Let's try again!");
                System.exit(0);
            }
            count++;
        }

        System.out.println("Congratulations, " + name + "!");
        System.exit(0);
    }
}
