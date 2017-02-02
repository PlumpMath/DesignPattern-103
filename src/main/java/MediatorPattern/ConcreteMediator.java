package MediatorPattern;

/**
 * Created by patch on 2/1/17.
 */
public class ConcreteMediator extends Mediator {
    private Friend1 friend1;
    private Friend2 friend2;
    private Boss boss;

    public void setFriend1(Friend1 friend1) {
        this.friend1 = friend1;
    }

    public void setFriend2(Friend2 friend2) {
        this.friend2 = friend2;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void send(Friend friend, String message) {
        if (friend == friend1) {
            friend2.notify(message);
            boss.notify(friend1.name + " sends message to " + friend2.name);
        }
        if (friend == friend2) {
            friend1.notify(message);
            boss.notify(friend2.name + " sends message to " + friend1.name);
        }
        if (friend == boss) {
            friend1.notify(message);
            friend2.notify(message);
        }
    }
}
