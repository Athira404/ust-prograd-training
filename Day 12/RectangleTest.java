import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @Nested
    class TestingAreaOfRectangle {
        @BeforeEach
        public void setObj() {
            rectangle = new Rectangle();
        }

        @Test
        public void checkAreaIsFifteenIfLengthIsThreeAndBreadthIsFive() {
            double actualAnswer = rectangle.area(3, 5);
            double expectedAnswer = 15;
            assertEquals(expectedAnswer, actualAnswer);
        }

        @Test
        public void checkAreaIsEightIfLengthIsTwoAndBreadthIsFour(){
            double actualAnswer = rectangle.area(2 , 4);
            double expectedAnswer = 8;
            assertEquals(expectedAnswer , actualAnswer);
        }

        @Test
        public void checkAreaIsTenIfLengthIsTwoAndBreadthIsFive(){
            double actualAnswer = rectangle.area(2 , 5);
            double expectedAnswer = 10;
            assertEquals(expectedAnswer , actualAnswer);
        }

        @Test
        public void throwsInputMismatchExceptionWhenInputIsNegative(){
            assertThrows(InputMismatchException.class, () -> rectangle.area(2 , -3));
        }

        @Test
        public void throwsInputMismatchExceptionWhenInputIsZero(){
            assertThrows(InputMismatchException.class, () -> rectangle.area(0 , -3));
        }
    }
}