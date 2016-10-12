package Calc;

import java.io.IOException;

/**
 * Created by christiancampbell on 10/10/16.
 */
public class Main {
    public static void main(String[] args) {
        // Use try catch statements
        try {
            Calc.Calculator();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
