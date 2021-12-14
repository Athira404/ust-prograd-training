import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @Nested
    class AreaTest {
        @Test
        public void checkAreaIsSixteenIfSideIsFour() {
            square = new Square(4);
            double actualArea = square.area();
            double expectedArea = 16;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checkAreaIsThirtySixIfSideIsSix() {
            square = new Square(6);
            double actualArea = square.area();
            double expectedArea = 36;
            assertEquals(expectedArea, actualArea);
        }
    }
    @Nested
    class PerimeterTest {
        @Test
        public void checkPerimeterIsSixteenIfSideIsFour() {
            square = new Square(4);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 16;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void checkPerimeterIsTwentyFourIfSideIsSix() {
            square = new Square(6);
            double actualPerimeter = square.perimeter();
            double expectedPerimeter = 24;
            assertEquals(expectedPerimeter, actualPerimeter);
        }
    }

    @Nested
    class TestingInputAndThrowExceptions {
        @Test
        public void throwsIllegalArgumentExceptionIfInputIsZero() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-2));
        }

        @Test
        public void throwsIllegalArgumentExceptionIfInputIsNegative() {
            assertThrows(IllegalArgumentException.class, () -> new Square(0));
        }
    }
}