package task6;

import java.awt.*;
import java.applet.*;

public class Purple extends Printer{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    @Override
    void print(String value) {
        System.out.println(ANSI_PURPLE + value + ANSI_RESET );
    }

    public Purple() {
    }
}
