package StatePattern;

/**
 * Created by patch on 1/31/17.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo****\n");
        Off initialState = new Off();
        TV tv = new TV(initialState);

        tv.pressButton();

        tv.pressButton();
    }
}
