import {isPalindromeUsingTwoPointers} from './valid-palindrome';

describe('Palindrome check', function () {
    it('should return true for valid palindrome', function () {
        const str = "racecar";
        expect(isPalindromeUsingTwoPointers(str)).toBeTruthy();
    });

    it('should return false for invalid palindrome', function () {
        const str = "racaecar";
        expect(isPalindromeUsingTwoPointers(str)).toBeFalsy();
    });
});