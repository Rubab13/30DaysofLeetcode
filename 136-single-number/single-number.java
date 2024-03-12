class Solution {
    public static int singleNumber (int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                a = array[i];
            }
        }
        return a;
    }
    public static void main (String[] args) {
        int[] array = {1, 2, 2, 1, 3};
        int a = singleNumber(array);
        System.out.println("Answer: " + a);
    }
}