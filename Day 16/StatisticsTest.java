import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest {
    Statistics statistics=new Statistics();

//    @Nested
//    public class ThrowExceptionInEventsTest{
//        @Test
//        public void throwIllegalArgumentExceptionIfProbabilityOfHeadOrProbabilityOfTailIsNegative(){
//            assertThrows(IllegalArgumentException.class,()-> new Statistics(-6,-3));
//        }
//    }

    @Nested
    public class ProbabilityOfHeadAndTailEqualsTest {
        @Test
        public void checkIfProbabilityOfHeadIsEqualToTailWhenACoinIsTossed() {
//            statistics = new Statistics(0.5, 0.5);
            boolean actualProbability = statistics.probabilityOfHeadAndTailEquals(0.5,0.5);
            assertTrue(actualProbability); //assertEquals(true, actualProbability);
        }
    }

    @Nested
    public class ProbabilityOfEventOccursTogetherTest{
        @Test
        public void checkIfProbabilityOfHeadAndTailOccursTogetherGivesZeroPointTwoFive(){
//            statistics = new Statistics(0.5, 0.5);
            double actualProbability=statistics.probabilityOfHeadAndTailOccursTogether(0.5,0.5);
            double expectedProbability=0.25;
            assertEquals(expectedProbability,actualProbability);
        }

    }
    @Nested
    public class ProbabilityOfEventNotOccurringTest{
        @Test
        public void checkIfProbabilityOfHeadEventNotOccurring(){
//            statistics=new Statistics("Head",0.5);
            double actualProbability=statistics.probabilityOfEventNotOccurring("Head",0.5);
            double expectedProbability=0.5;
            assertEquals(expectedProbability,actualProbability);
        }
        @Test
        public void checkIfProbabilityOfTailEventNotOccurring(){
//            statistics=new Statistics("Tail",0.5);
            double actualProbability=statistics.probabilityOfEventNotOccurring("Tail",0.5);
            double expectedProbability=0.5;
            assertEquals(expectedProbability,actualProbability);
        }
    }

    @Nested
    public class ProbabilityOfEitherTwoEventOccurringTest{
        @Test
        public void checkIfProbabilityOfEitherHeadOrTailOccurringIsOne(){
//            statistics=new Statistics(0.5,0.5);
            double actualProbability = statistics.probabilityOfEitherTwoEventsOccurring(0.5,0.5);
            double expectedProbability = 1;
            assertEquals(expectedProbability,actualProbability);
        }
    }

}