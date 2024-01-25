/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes, also numbers ending with 0,
        // except 0 itself.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // For numbers with an odd number of digits, we can get rid of the middle digit by reversedHalf/10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
