class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int minimum = 0;
        int previous = Integer.MIN_VALUE;
        for (int[] value : intervals) {
            if (previous > value[0]) {
                minimum++;
                previous = Math.min(previous, value[1]);
            } else {
                previous = value[1];
            }
        }
        return minimum;
    }
}
