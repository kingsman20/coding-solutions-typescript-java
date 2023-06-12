package validpalindrome;


/**
 * Note: A palindrome is a word, phrase, or sequence of characters that reads the same backward as forward.
 */
public class ValidPalindrome {
    /**
     * @param str input string
     * @return boolean
     * @implNote Check if a string is a palindrome using the two pointers technique
     */
    public boolean isAPalindromeUsingTwoPointers(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // if both right and left are equal, we move both pointers inward
            left = left + 1;
            right = right - 1;
        }

        return true;
    }
}
