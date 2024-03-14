public class Solution {
    public int reverseBits(int n) {
        int result = 0;     //first we have to  initialize the result variable
        //for loop for iterating throughout the integer
        for (int i = 0; i < 32; i++) {
            int LSB = n & 1;        //we'll get to know which element is the rightmost
            int reverse = LSB << (31-i);        // shifting the bit to its position in the reversed integer
            result = result | reverse;
            n = n >> 1;     //reducing the number to align it with our LSB
        }
        return result;
    }
}