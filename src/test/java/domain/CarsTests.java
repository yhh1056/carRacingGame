package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author {yhh1056}
 * Create by {2020/10/28}
 */
class CarsTests {

    @Test
    @DisplayName("일급컬렉션 객체 테스트")
    void CarsTest() {
        String[] names = new String[3];
        names[0] = "kiki";
        names[1] = "haha";
        names[2] = "hoho";

        Cars cars = new Cars(names);
        List<Car> carList = cars.getCarList();

        assertEquals("kiki", carList.get(0).getName());
    }

}