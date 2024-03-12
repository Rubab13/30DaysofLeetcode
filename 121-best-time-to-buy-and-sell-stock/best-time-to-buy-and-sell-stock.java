class Solution {
    public static int maxProfit(int[] array) {
    
        int min = array[0];
        int max = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } 
            else if (array[i] - min > max) {
                max = array[i] - min;
            }
        }
        
        return max;
    }
    
    public static void main(String[] args) {

        int[] array = {7,1,5,3,6,4};
        // int[] array = {2,4,1};
        // int[] array = {7,6,4,3,1};
        
        System.out.println("The profit will be " + maxProfit(array) + ".");
        
    }
}
