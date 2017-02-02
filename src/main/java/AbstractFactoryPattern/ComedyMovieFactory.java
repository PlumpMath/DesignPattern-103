package AbstractFactoryPattern;

/**
 * Created by patch on 1/31/17.
 */
public class ComedyMovieFactory implements IMoiveFactory {
    @Override
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
