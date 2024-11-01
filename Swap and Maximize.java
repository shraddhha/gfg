
class Solution {
    public long maxSum(Long[] arr) {
        // code here
         Arrays.sort(arr);
        
        // Step 2: Use two pointers to rearrange elements in the high-low pattern
        int n = arr.length;
        Long[] reordered = new Long[n];
        int left = 0;
        int right = n - 1;
        int index = 0;
        
        while (left <= right) {
            if (left == right) {
                reordered[index++] = arr[left];
            } else {
                reordered[index++] = arr[left];
                reordered[index++] = arr[right];
            }
            left++;
            right--;
        }
        
      
        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += Math.abs(reordered[i] - reordered[(i + 1) % n]);
        }
        
        return maxSum;
    
    }
}
