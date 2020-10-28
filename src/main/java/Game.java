import domain.Car;
import domain.Cars;
import utils.Rule;
import view.Input;
import domain.User;

import java.util.*;

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

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(super.randomNumberBounds);
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
            progress[i] = progressChar;
        }
        return progress;
    }

    private void printProgress() {
        System.out.println(sb.toString());
        sb.setLength(0);
    }

    private void showWinner() {
        int winnerPoint = getWinnerPoint();

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == winnerPoint) {
                winners.add(car.getName());
            }
        }

        String result = String.join(", ", winners);
        System.out.println(result);
    }

    public int getWinnerPoint() {
        Collections.sort(cars);
        return cars.get(0).getPosition();
    }
}
