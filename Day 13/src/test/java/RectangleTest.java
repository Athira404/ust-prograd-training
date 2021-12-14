import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    private Rectangle rectangle;

    @Nested
    class TestingAreaOfRectangle {
//        @BeforeEach
//        public void setObj() {
//            rectangle = new Rectangle();
//        }

        @Test
        public void checkAreaIsFifteenIfLengthIsThreeAndBreadthIsFive() {
            rectangle = new Rectangle(3, 5);
            double actualArea = rectangle.area();
            double expectedArea = 15;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checkAreaIsEightIfLengthIsTwoAndBreadthIsFour() {
            rectangle = new Rectangle(2, 4);
            double actualArea = rectangle.area();
            double expectedArea = 8;
            assertEquals(expectedArea, actualArea);
        }

        @Test
        public void checkAreaIsTenIfLengthIsTwoAndBreadthIsFive() {
            rectangle = new Rectangle(2, 5);
            double actualArea = rectangle.area();
            double expectedArea = 10;
            assertEquals(expectedArea, actualArea);
        }
    }

    @Nested
    class TestingPerimeterOfRectangle {

//        @BeforeEach
//        public void setObj(){
//            rectangle = new Rectangle(rectangle.length, rectangle.breadth);
//        }

        @Test
        public void checkPerimeterIsTenIfLengthIsTwoAndBreadthIsThree() {
            rectangle = new Rectangle(2, 3);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 10;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void checkPerimeterIsFourteenIfLengthIsTwoAndBreadthIsFive() {
            rectangle = new Rectangle(2, 5);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 14;
            assertEquals(expectedPerimeter, actualPerimeter);
        }

        @Test
        public void checkPerimeterIsFortyIfLengthIsThirteenAndBreadthIsSeven() {
            rectangle = new Rectangle(13, 7);
            double actualPerimeter = rectangle.perimeter();
            double expectedPerimeter = 40;
            assertEquals(expectedPerimeter, actualPerimeter);
        }
    }

    @Nested
    class TestingInputAndThrowExceptions{
        @Test
        public void throwsIllegalArgumentExceptionWhenInputIsNegative() {
//            rectangle = new Rectangle(-3, 9);
            assertThrows(IllegalArgumentException.class, () -> new Rectangle(-3, 9));
        }

        @Test
        public void throwsIllegalArgumentExceptionWhenInputIsZero() {
//            rectangle = new Rectangle(6, 0);
            assertThrows(IllegalArgumentException.class, () -> new Rectangle(6, 0));
        }
    }
}