package PrototypePattern;

/**
 * Created by patch on 2/1/17.
 */
public class Nano extends BasicCar {
    public Nano(String m) {
        modeIname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
