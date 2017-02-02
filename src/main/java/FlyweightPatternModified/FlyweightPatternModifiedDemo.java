package FlyweightPatternModified;

import java.util.Random;

/**
 * Created by patch on 1/31/17.
 */
public class FlyweightPatternModifiedDemo {
    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example Modified***\n");
        Robot shape;
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("king");
            shape.setColorOfRobot(getRandomColor());
            shape.print();
        }

        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("queen");
            shape.setColorOfRobot(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + numOfDistinctRobots);
    }

    static String getRandomColor() {
        Random r = new Random();
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
