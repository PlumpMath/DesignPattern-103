package FlyweightPatternModified;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patch on 1/31/17.
 */
public class RobotFactory {
    Map<String, IRobot> shapes = new HashMap<>();

    public int totalObjectsCreated() {
        return shapes.size();
    }

    public IRobot getRobotFromFactory(String robotType) throws Exception {
        IRobot robotCategory = null;
        if (shapes.containsKey(robotType)) {
            robotCategory = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "king":
                    System.out.println("We do not have king robot. so we are creating a king robot now.");
                    robotCategory = new Robot("king");
                    shapes.put("king", robotCategory);
                    break;
                case "queen":
                    System.out.println("We do not have queen robot. so we creating a queen robot now.");
                    robotCategory = new Robot("queen");
                    shapes.put("queen", robotCategory);
                    break;
                default:
                    throw new Exception("Robot Factory can create only king and queen robot");
            }
        }
        return robotCategory;
    }
}
