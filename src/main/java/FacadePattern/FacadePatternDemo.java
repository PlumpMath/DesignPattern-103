package FacadePattern;

/**
 * Created by patch on 1/30/17.
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***");
        RobotFacade robotFacade = new RobotFacade();
        robotFacade.constructRobot("Green", "Iron");
        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.constructRobot("Blue", "Steel");
    }
}
