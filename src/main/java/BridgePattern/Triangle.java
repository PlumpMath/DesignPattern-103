package BridgePattern;

/**
 * Created by patch on 2/1/17.
 */
public class Triangle extends Shape {
    public Triangle(IColor color) {
        super(color);
    }

    @Override
    public void drawShape(int border) {
        System.out.print(" This Triangle is colored with: ");
        color.fillWithColor(border);
    }

    @Override
    public void modifyBorder(int border, int increment) {
        System.out.println("\nNow we are changing the border length "+increment+ " times");
        border=border*increment;
        drawShape(border);
    }
}
