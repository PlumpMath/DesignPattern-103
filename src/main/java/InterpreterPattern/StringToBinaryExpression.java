package InterpreterPattern;

/**
 * Created by patch on 2/2/17.
 */
public class StringToBinaryExpression implements IExpression {
    private String string;

    public StringToBinaryExpression(String string) {
        this.string = string;
    }

    @Override
    public void interpret(Context context) {
        context.getBinaryForm(string);
    }
}
