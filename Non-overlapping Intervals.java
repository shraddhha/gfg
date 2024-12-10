class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
         Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int prevEnd = Integer.MIN_VALUE; // End of the last non-overlapping interval
        int removeCount = 0;           
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (start >= prevEnd) {
            
                prevEnd = end;
            } else {
               
                removeCount++;
            }
        }

        return removeCount;
    }
}
