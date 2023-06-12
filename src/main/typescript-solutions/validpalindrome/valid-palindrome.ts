/**
 * @param str
 * @returns boolean
 * @description checks if a string is a palindrome using two pointers technique
 */
export const isPalindromeUsingTwoPointers = (str: string): boolean => {
    let left = 0;
    let right = str.length - 1;

    while (left <= right) {
        if (str[left] != str[right]) {
            return false;
        }

        left += 1;
        right -= 1;
    }

    return true;
}