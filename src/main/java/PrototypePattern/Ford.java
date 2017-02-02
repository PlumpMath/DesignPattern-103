package PrototypePattern;

/**
 * Created by patch on 2/1/17.
 */
public class Ford extends BasicCar {
    public Ford(String m) {
        modeIname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
