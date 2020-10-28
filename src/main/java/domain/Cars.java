package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * author {yhh1056}
 * Create by {2020/10/28}
 */
public class Cars {
    private final List<Car> cars = new ArrayList<>();
    private String[] carNames;

    public Cars(String[] carNames) {
        this.carNames = carNames;
    }

    public void registeredCar() {
        for (String carName : this.carNames) {
            this.cars.add(new Car(carName));
        }
    }

    public List<Car> getCarList() {
        return cars;
    }
}
