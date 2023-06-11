package validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPalindromeTest {

    @Test
    public void testAdd() {
        ValidPalindrome calculator = new ValidPalindrome();
        int sum = calculator.add(2, 3);
        assertEquals(5, sum, "2 + 3 should equal 5");
    }
}
