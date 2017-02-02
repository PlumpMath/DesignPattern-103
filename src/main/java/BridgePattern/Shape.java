package BridgePattern;

/**
 * Created by patch on 2/1/17.
 */
public abstract class Shape {
    protected IColor color;

    public Shape(IColor color) {
        this.color = color;
    }

    public abstract void drawShape(int border);

    public abstract void modifyBorder(int border, int increment);
}
