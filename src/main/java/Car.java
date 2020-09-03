/**
 * author {yhh1056}
 * Create by {2020/09/03}
 */
public class Car implements Comparable<Car> {
    private String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        this.position++;
    }

    @Override
    public int compareTo(Car car) {
        return car.getPosition() - position;
    }
}
