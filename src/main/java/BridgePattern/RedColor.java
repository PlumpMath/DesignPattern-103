package BridgePattern;

/**
 * Created by patch on 2/1/17.
 */
public class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Red color with " +border+" inch border");
    }
}
