class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length - 1;

      
        while (start < end) {
            // Swap arr[start] and arr[end]
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

           
            start++;
            end--;
        }
    }


}
