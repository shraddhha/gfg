
class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        
        int maxSteps = 0;
        int currentSteps = 0;

        for (int i = 1; i < arr.length; i++) {
           
            if (arr[i] > arr[i - 1]) {
                currentSteps++;
                
                maxSteps = Math.max(maxSteps, currentSteps);
            } else {
              
                currentSteps = 0;
            }
        }
        
        return maxSteps;
    
    }
}
