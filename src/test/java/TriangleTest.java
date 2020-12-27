import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class TriangleTest {

    @Test
    @DisplayName("Проверка функции площадки треугольника")
    public void checkGetSquare() {
        double fact = Triangle.getSquare(2, 3, 4);
        double expected = 2.9047375096555625;

        MatcherAssert.assertThat(fact, equalTo(expected));
    }

}
