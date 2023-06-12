package validpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void testIsAValidPalindrome() {
        String strOne = "racecar";
        boolean isAPalindromeOne = validPalindrome.isAPalindromeUsingTwoPointers(strOne);
        assertTrue(isAPalindromeOne);
    }

    @Test
    public void testIsNotAValidPalindrome() {
        String strOne = "racaecar";
        boolean isAPalindromeOne = validPalindrome.isAPalindromeUsingTwoPointers(strOne);
        assertFalse(isAPalindromeOne);
    }
}
