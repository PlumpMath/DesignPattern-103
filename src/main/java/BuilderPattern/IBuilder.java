package BuilderPattern;

/**
 * Created by patch on 1/31/17.
 */
public interface IBuilder {
    void buildBody();
    void insertWheels();
    void addHeadlights();
    Product getVehicle();
}
