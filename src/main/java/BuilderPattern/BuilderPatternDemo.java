package BuilderPattern;

/**
 * Created by patch on 1/31/17.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***\n");

        Director director = new Director();

        IBuilder carBuilder = new Car();
        IBuilder motorBuilder = new MotorCycle();

        director.constructor(carBuilder);
        Product product1 = carBuilder.getVehicle();
        product1.show();

        director.constructor(motorBuilder);
        Product product2 = motorBuilder.getVehicle();
        product2.show();
    }
}
