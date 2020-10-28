import domain.Car;
import domain.Cars;
import utils.Rule;
import view.Input;
import domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Game extends Rule {
    private List<Car> cars;
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
        Cars cars = new Cars(carNames);
        cars.registeredCar();
        this.cars = cars.getCarList();
    }

    private void racingStart() {
        while (++round < user.getGameCount()) {
            moveCar();
        }
    }

    private void moveCar() {
        for (Car car : cars) {
            isMovedCar(car);
            containsProgress(car);
        }
        printProgress();
    }

    private void isMovedCar(Car car) {
        if (isMoved(getRandomNumber())) {
            car.move();
        }
    }

    private void containsProgress(Car car) {
        sb.append(car.getName())
                .append(colon)
                .append(getProgress(car))
                .append(lineEnd);
    }

    private char[] getProgress(Car car) {
        char[] progress = new char[car.getPosition()];

        for (int i = 0; i < car.getPosition(); i++) {
            progress[i] = super.progressChar;
        }
        return progress;
    }

    private void printProgress() {
        System.out.println(sb.toString());
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(super.randomNumberBounds);
    }

    private void showWinner() {
//        Car winner = cars[super.winnerIndex];
//        int winPosition = winner.getPosition();
//
//        Arrays.sort(cars);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(winner.getName());
//        isMultipleWinner(sb, winPosition);
//        sb.append(super.winnerMessage);
//
//        System.out.println(sb.toString());
    }

//    private void isMultipleWinner(StringBuilder sb, int winPosition) {
//        for (int i = 1; i < cars.length; i++) {
//            if (cars[i].getPosition() == winPosition) {
//                sb.append(super.comma).append(cars[i].getName());
//            }
//        }
//    }
}
