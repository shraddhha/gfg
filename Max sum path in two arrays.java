class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
         int i = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        int result = 0;

        // Traverse both lists
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum1 += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum2 += arr2.get(j);
                j++;
            } else {
                // Common element found
                result += Math.max(sum1, sum2) + arr1.get(i);
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.size()) {
            sum1 += arr1.get(i);
            i++;
        }

        // Add remaining elements of arr2
        while (j < arr2.size()) {
            sum2 += arr2.get(j);
            j++;
        }

        // Add the maximum of the final sums
        result += Math.max(sum1, sum2);

        return result;
    
    }
}
