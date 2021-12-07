//add
//sub
//mul
//div  -----> Requirement From the client

import org.junit.jupiter.api.*;


public class CalculatorTest {
    private Calculator calc ;
//    @AfterEach --> after test case executed
//    @AfterAll
//    we rarely use before all, after each, after all

    @BeforeEach //runs before every test case @BeforeAll --> It will run only once before the test case
    public void setup(){
        calc = new Calculator();//to avoid repeating object creation
    }

    @Nested //--> Add functions are grouped under TestingAddFunction class
    class TestingAddFunction{
        @BeforeEach
        public void setup(){
            calc = new Calculator();
        }

        @Test
        public void FivePlusThreeIsEight(){
//        setup();
            double answer = calc.add(5,3);
            double correctAnswer = 8;
            Assertions.assertEquals(answer , correctAnswer);
        }

        @Test
        public void FivePlusFiveIsTen(){
//        setup();-->BeforeEach
//        Calculator calc = new Calculator();-->no need coz before each is there
            double answer = calc.add(5,5);
            double expected = 10;
            Assertions.assertEquals(answer , expected);
        }
    }

    @Nested
    class TestingSubFunction{
        @Test
        public void TenMinusThreeIsSeven(){
            double answer = calc.sub(10 , 3);
            double expected = 7;
            Assertions.assertEquals(answer , expected);
        }

        @Test
        public void EightMinusThreeIsFive(){
            double answer = calc.sub(8 , 3);
            double expected = 5;
            Assertions.assertEquals(answer , expected);
        }
        @Test
        public void EightMinusTenIsNegativeTwo(){
            double answer = calc.sub(8 , 10);
            double expected = -2;
            Assertions.assertEquals(answer , expected);
        }
    }


    @Nested
    class TestingDivFunction {
        @Test
        public void TenDividesTwoIsFive() {
            double answer = calc.div(10, 2);
            double expected = 5;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void SixDividesTwoIsThree() {
            double answer = calc.div(6, 2);
            double expected = 3;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void throwsExceptionWhenDivideByZero() {
            Assertions.assertThrows(ArithmeticException.class, () -> calc.div(10, 0));
        }
    }

    @Nested
    class TestingMulFunction {
        @Test
        public void ThreeMultipliesTwoIsSix() {
            double answer = calc.mul(3, 2);
            double expected = 6;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void SixMultipliesTwoIsTwelve() {
            double answer = calc.mul(6, 2);
            double expected = 12;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void FourMultipliesOneIsFour() {
            double answer = calc.mul(6, 2);
            double expected = 12;
            Assertions.assertEquals(answer, expected);
        }

    }
}
