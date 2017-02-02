package PrototypePattern;

import java.util.Random;

/**
 * Created by patch on 2/1/17.
 */
public abstract class BasicCar implements Cloneable {
    public String modeIname;
    public int price;

    public String getModeIname() {
        return this.modeIname;
    }

    public void setModeIname(String modeIname) {
        this.modeIname = modeIname;
    }

    public static int setPrice() {
        int price = 0;
        Random r = new Random();
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
