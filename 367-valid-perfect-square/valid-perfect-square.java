class Solution {
    public static boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long low = 2;
        long high = num / 2;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            }
            else if (square < num) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
}
