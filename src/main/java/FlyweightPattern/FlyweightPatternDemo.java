package FlyweightPattern;

/**
 * Created by patch on 1/31/17.
 */
public class FlyweightPatternDemo {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        IRobot shape = myFactory.getRobotFromFactory("small");
        shape.print();

        for (int i = 0 ; i < 2; i++) {
            shape = myFactory.getRobotFromFactory("small");
            shape.print();
        }
        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now= " + numOfDistinctRobots);

        for (int i = 0; i < 5; i++) {
            shape = myFactory.getRobotFromFactory("large");
            shape.print();
        }

        numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + numOfDistinctRobots);
    }
}
