/*Complete the function below*/

class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        int n = arr.length;

        if (n < 3) {
            return new ArrayList<>();
        }

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMin array
        leftMin[0] = -1; // No element to the left of the first element
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
                leftMin[i] = -1;
            } else {
                leftMin[i] = minIndex;
            }
        }

        // Fill rightMax array
        rightMax[n-1] = -1; // No element to the right of the last element
        int maxIndex = n-1;

        for (int i = n-2; i >= 0; i--) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
                rightMax[i] = -1;
            } else {
                rightMax[i] = maxIndex;
            }
        }

        // Find the required triplet
        for (int i = 1; i < n-1; i++) {
            if (leftMin[i] != -1 && rightMax[i] != -1) {
                List<Integer> result = new ArrayList<>();
                result.add(arr[leftMin[i]]);
                result.add(arr[i]);
                result.add(arr[rightMax[i]]);
                return result;
            }
        }

        // No such triplet found
        return new ArrayList<>();
    
    }
}
