package BuilderPattern;

/**
 * Created by patch on 1/31/17.
 */
public class Director {
    IBuilder builder;

    public void constructor(IBuilder builder) {
        this.builder = builder;
        this.builder.buildBody();
        this.builder.insertWheels();
        this.builder.addHeadlights();
    }
}
