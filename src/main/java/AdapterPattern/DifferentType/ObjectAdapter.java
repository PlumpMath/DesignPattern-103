package AdapterPattern.DifferentType;

/**
 * Created by patch on 1/30/17.
 */
public class ObjectAdapter {
    private IIntegerValue myInt;
    public ObjectAdapter(IIntegerValue myInt) {
        this.myInt = myInt;
    }

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}
