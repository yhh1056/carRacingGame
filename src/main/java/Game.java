import view.Input;
import view.User;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Game {
    private Car[] cars;
    private User user;

    public Game() {
        Input input = new Input();
        this.user = input.getUserInputData();
    }

    public void start() {
        readyCars();
    }

    private void readyCars() {
        String[] names = user.getNames();
        createCar(names);
    }

    private void createCar(String[] carNames) {
        cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
    }
}
