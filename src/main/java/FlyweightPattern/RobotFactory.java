package FlyweightPattern;

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

    public IRobot getRobotFromFactory(String robotCategory) throws Exception {
        IRobot robot = null;
        if (shapes.containsKey(robotCategory)) {
            robot = shapes.get(robotCategory);
        } else {
            switch (robotCategory) {
                case "small":
                    System.out.println("We do not have small Robot. So we are creating a small robot now.");
                    robot = new SmallRobot();
                    shapes.put("small", robot);
                    break;
                case "large":
                    System.out.println("We do not have large robot. So we are creating large robot no2.");
                    robot = new LargeRobot();
                    shapes.put("large", robot);
                    break;
                default:
                    throw new Exception("robot factory can create only small and large shapes");
            }
        }
        return robot;
    }
}
