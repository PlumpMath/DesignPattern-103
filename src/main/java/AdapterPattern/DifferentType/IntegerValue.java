package AdapterPattern.DifferentType;

/**
 * Created by patch on 1/30/17.
 */
public class IntegerValue implements IIntegerValue {
    @Override
    public int getInteger() {
        return 5;
    }
}
