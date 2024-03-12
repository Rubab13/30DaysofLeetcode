class Solution {
    public static int[] productExceptSelf(int[] array) {
        int[] answer = new int[array.length];
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        left[0] = 1;
        for (int i = 1; i < array.length; i++) {
            left[i] = left[i - 1] * array[i - 1];
        }
        right[array.length - 1] = 1;
        for (int i = array.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * array[i + 1];
        }
        for (int i = 0; i < array.length; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] array = {-1, 1, 0, -3, 3};
        int[] result = productExceptSelf(array);
        for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
  }
}