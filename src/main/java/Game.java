import domain.Car;
import utils.Rule;
import view.Input;
import domain.User;

import java.util.Arrays;
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
        showWinner();
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

            sb.append(car.getName()).append(super.colon).append(getProgress(car)).append(super.lineEnd);
        }
        System.out.println(sb.toString());
    }

    private char[] getProgress(Car car) {
        char[] progress = new char[car.getPosition()];
        for (int i = 0; i < car.getPosition(); i++) {
            progress[i] = super.progressChar;
        }
        return progress;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(super.randomNumberBounds);
    }

    private void showWinner() {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(cars);

        int winPosition = cars[super.winnerIndex].getPosition();
        sb.append(cars[super.winnerIndex].getName());

        isMultipleWinner(sb, winPosition);

        sb.append(super.winnerMessage);

        System.out.println(sb.toString());

    }

    private void isMultipleWinner(StringBuilder sb, int winPosition) {
        for (int i = 1; i < cars.length; i++) {
            if (cars[i].getPosition() == winPosition) {
                sb.append(super.comma).append(cars[i].getName());
            }
        }
    }
}
