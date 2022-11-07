package task6;

public class Blue extends Printer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    @Override
    void print(String value) {
        System.out.println(ANSI_BLUE + value + ANSI_RESET);
    }

    public Blue() {
    }
}
