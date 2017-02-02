package BridgePattern;

/**
 * Created by patch on 2/1/17.
 */
public class Rectangle extends Shape {
    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    public void drawShape(int border) {
        System.out.print(" This Rectangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\n Now we are changing the border length "+increment+ " times");
        border=border*increment;
        drawShape(border);
    }
}
