package AbstractFactoryPattern;

/**
 * Created by patch on 1/31/17.
 */
public class ActionMovieFactory implements IMoiveFactory {
    @Override
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
