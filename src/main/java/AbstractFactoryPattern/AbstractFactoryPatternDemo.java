package AbstractFactoryPattern;

/**
 * Created by patch on 1/31/17.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***");
        ActionMovieFactory actionMovieFactory = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovieFactory.getTollywoodMovie();
        IBollywoodMovie bAction = actionMovieFactory.getBollywoodMovie();

        System.out.println("\nAction movies are:");
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());

        ComedyMovieFactory comedyMovieFactory = new ComedyMovieFactory();
        ITollywoodMovie tComdey = comedyMovieFactory.getTollywoodMovie();
        IBollywoodMovie bComdey = comedyMovieFactory.getBollywoodMovie();

        System.out.println("\nComedy movies are:");
        System.out.println(tComdey.movieName());
        System.out.println(bComdey.movieName());
    }
}
