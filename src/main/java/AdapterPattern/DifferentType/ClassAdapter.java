package AdapterPattern.DifferentType;

/**
 * Created by patch on 1/30/17.
 */
public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}
