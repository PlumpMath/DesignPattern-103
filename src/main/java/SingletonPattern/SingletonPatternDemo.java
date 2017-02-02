package SingletonPattern;

/**
 * Created by patch on 1/29/17.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for our team");
        MakeACaptain c1 = MakeACaptain.getCaptain();
        System.out.println("Trying to make another captain for our team");
        MakeACaptain c2 = MakeACaptain.getCaptain();

        if (c1 == c2) {
            System.out.println("c1 and c2 are same instance");
        }
    }
}

class MakeACaptain {
    private static MakeACaptain _captain;

    private MakeACaptain() {}

    public static MakeACaptain getCaptain() {
        if (_captain == null) {
            _captain = new MakeACaptain();
            System.out.println("New Captain selected for our team");
        } else {
            System.out.print("You already have a Captain for your team.");
            System.out.println("Send him for the toss.");
        }
        return _captain;
    }
}
