class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here
        int n = arr.size();
        
        // Traverse the list and swap elements to their correct positions
        for (int i = 0; i < n; i++) {
            // Continue swapping until arr[i] is in its correct position or invalid
            while (arr.get(i) != -1 && arr.get(i) != i) {
                int correctIndex = arr.get(i); // Get the correct index for arr[i]
                
                // Swap only if the destination isn't already correct or a duplicate
                if (arr.get(correctIndex) == arr.get(i)) {
                    break; // Avoid infinite loops on duplicate values
                }
                
                // Manually swap arr[i] with arr[correctIndex]
                int temp = arr.get(i);
                arr.set(i, arr.get(correctIndex));
                arr.set(correctIndex, temp);
            }
        }
        
        // Set any element that is not in its correct position to -1
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != i) {
                arr.set(i, -1);
            }
        }
        
        return arr;
    }
}
