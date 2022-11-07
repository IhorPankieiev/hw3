package task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Purple();
        Printer printer2 = new Green();
        Printer printer3 = new Blue();

        Scanner newText = new Scanner(System.in);
        String text = newText.nextLine();

        printer1.print(text);
        printer2.print(text);
        printer3.print(text);
    }
}
