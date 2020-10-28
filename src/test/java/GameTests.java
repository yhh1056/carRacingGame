import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author {yhh1056}
 * Create by {2020/10/29}
 */
class GameTests {

    @Test
    @DisplayName("게임 카운트")
    void gameCount() {
        int round = 0;
        while (++round < 5) {
            ///
        }
        assertEquals(5, round);
    }

}