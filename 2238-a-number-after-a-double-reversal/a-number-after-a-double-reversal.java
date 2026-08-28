class Solution {
    public boolean isSameAfterReversals(int num) {
        int reversedNumber = reverseNumber(num);
        return num == reverseNumber(reversedNumber);
    }
    public int reverseNumber(int num) {
        int reversedNumber = 0;

        while (num > 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num /= 10;
        }
        return reversedNumber;
    }
}