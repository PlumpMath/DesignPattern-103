package InterpreterPattern;

import java.util.Scanner;

/**
 * Created by patch on 2/2/17.
 */
public class InterpretePatternDemo {
    public Context clientContext = null;
    public IExpression expression = null;

    public InterpretePatternDemo(Context context) {
        this.clientContext = context;
    }

    public void interpret(String string) {
        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter ur choice(1 or 2)");
            Scanner in = new Scanner(System.in);
            String c = in.nextLine();
            if (c.equals("1")) {
                expression = new IntToWords(string);
                expression.interpret(clientContext);
            } else {
                expression = new StringToBinaryExpression(string);
                expression.interpret(clientContext);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n***Interpreter Pattern Demo***\n");
        System.out.println("Enter a number :");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Context context = new Context(input);
        InterpretePatternDemo client = new InterpretePatternDemo(context);
        client.interpret(input);
    }
}
