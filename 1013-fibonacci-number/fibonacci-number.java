class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int index = n+1;
        
        int number1 = 0;
        int number2 = 1;
        int c;
        
        int[] array = new int[index];
        array[0] = number1;
        array[1] = number2;
        for (int i = 2; i < array.length; i++) {
            c = number1 + number2;
            array[i] = c;
            number1 = number2;
            number2 = c;
        }
        
        return array[n];
    }
}