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
        readyCars(user.getNames());
        racingStart();
    }

    private void readyCars(String[] names) {
        createCar(names);
    }

    private void createCar(String[] carNames) {
        cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }
    }

    private void racingStart() {
        for (int round = 0; round < user.getGameCount(); round++) {
            moveCar();
        }
    }

    private void moveCar() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            if (isMoved(getRandomNumber())) {
                car.move();
            }

            sb.append(car.getName()).append(" : ").append(getProgress(car)).append("\n");
        }
        System.out.println(sb.toString());
    }

    private char[] getProgress(Car car) {
        char[] progress = new char[car.getPosition()];
        for (int i = 0; i < car.getPosition(); i++) {
            progress[i] = '-';
        }
        return progress;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(randomNumberBounds);
    }
}
