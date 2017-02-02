package PrototypePattern;

/**
 * Created by patch on 2/1/17.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price = 100000;

        BasicCar ford_basic = new Ford("Ford Yellow");
        ford_basic.price = 500000;

        BasicCar basicCar1;
        basicCar1 = nano_base.clone();
        basicCar1.price = nano_base.price + BasicCar.setPrice();
        System.out.println("Car is: " + basicCar1.modeIname + " and it's price is Rs." + basicCar1.price);

        basicCar1 = ford_basic.clone();
        basicCar1.price = ford_basic.price + BasicCar.setPrice();
        System.out.println("Car is: " + basicCar1.modeIname + " and it's price is Rs." + basicCar1.price);
    }
}
