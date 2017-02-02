package FacadePattern;

/**
 * Created by patch on 1/30/17.
 */
public class RobotMetal {
    private String metal;

    public void setMetal(String metal) {
        this.metal = metal;
        System.out.println("Metal is set to : " + this.metal);
    }
}
