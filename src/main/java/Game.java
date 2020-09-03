import utils.Rule;
import view.Input;
import view.User;

import java.util.Random;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Game extends Rule {
    private Car[] cars;
    private User user;

    public Game() {
        Input input = new Input();
        this.user = input.getUserInputData();
    }

    public void start() {
        readyCars();
        racingStart();
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

    private void racingStart() {
        for (Car car : cars) {
            if (isMoved(getRandomNumber())) {
                car.move();
            }
        }
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(randomNumberBounds);
    }
}
