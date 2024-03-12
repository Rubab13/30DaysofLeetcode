class Solution {
  public static int[] productExceptSelf(int[] array) {
    int[] answer = new int[array.length];
    int[] leftProduct = new int[array.length];
    int[] rightProduct = new int[array.length];

    // Calculate left product
    leftProduct[0] = 1;
    for (int i = 1; i < array.length; i++) {
      leftProduct[i] = leftProduct[i - 1] * array[i - 1];
    }

    // Calculate right product
    rightProduct[array.length - 1] = 1;
    for (int i = array.length - 2; i >= 0; i--) {
      rightProduct[i] = rightProduct[i + 1] * array[i + 1];
    }

    // Calculate final product
    for (int i = 0; i < array.length; i++) {
      answer[i] = leftProduct[i] * rightProduct[i];
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