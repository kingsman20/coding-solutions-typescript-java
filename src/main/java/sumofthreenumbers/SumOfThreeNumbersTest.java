package sumofthreenumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumOfThreeNumbersTest {
    SumOfThreeNumbers sumOfThreeNumbers = new SumOfThreeNumbers();

    @Test
    public void testSumOfThreeReturnsTrue() {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};
        boolean result = sumOfThreeNumbers.findSumOfThree(nums, 10);
        assertTrue(result);
    }

    @Test
    public void testSumOfThreeReturnsFalse() {
        int[] nums = {1, -1, 0};
        boolean result = sumOfThreeNumbers.findSumOfThree(nums, -1);
        assertFalse(result);
    }
}
