package InterpreterPattern;

/**
 * Created by patch on 2/2/17.
 */
public class IntToWords implements IExpression {
    private String string;

    public IntToWords(String string) {
        this.string = string;
    }

    @Override
    public void interpret(Context context) {
        context.printInWords(string);
    }
}
