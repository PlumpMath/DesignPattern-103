package BridgePattern;

/**
 * Created by patch on 2/1/17.
 */
public class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Green color with " +border+" inch border.");
    }
}
