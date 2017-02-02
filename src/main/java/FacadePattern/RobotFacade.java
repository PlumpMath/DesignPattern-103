package FacadePattern;

/**
 * Created by patch on 1/30/17.
 */
public class RobotFacade {
    RobotColor robotColor;
    RobotMetal robotMetal;
    RobotBody robotBody;

    public RobotFacade() {
        this.robotColor = new RobotColor();
        this.robotMetal = new RobotMetal();
        this.robotBody = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("\nCreation of the robot start");
        robotColor.setColor(color);
        robotMetal.setMetal(metal);
        robotBody.createBody();
        System.out.println("\nRobot creation end");
        System.out.println();
    }
}
