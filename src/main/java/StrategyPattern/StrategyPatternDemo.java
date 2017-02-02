package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by patch on 1/30/17.
 */
public class StrategyPatternDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("***Strategy Pattern Demo***");
        Scanner in = new Scanner(System.in);
        IChoice iChoice = null;
        Context context = new Context();
        String input1, input2;
        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter an integer:");
                input1 = in.nextLine();
                System.out.println("Enter another integer:");
                input2 = in.nextLine();
                System.out.println("Enter user choice(1 or 2)");
                System.out.println("Press 1 for Addition, 2 for Concatenation");
//                String c = in.nextLine();

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String c = bufferedReader.readLine();

                if (c.equals("1")) {
                    iChoice = new FirstChoice();
                } else {
                    iChoice = new SecondChoice();
                }

                context.setChoice(iChoice);
                context.showChoice(input1, input2);
            }
        } finally {
            in.close();
        }

        System.out.println("End of Strategy pattern");
    }
}
