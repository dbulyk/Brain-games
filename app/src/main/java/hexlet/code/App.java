package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println(getGreeting());
    }


    public static String getGreeting() {
        System.out.println("Welcome to the Brain Games!");
        return Cli.greeting();
    }
}
