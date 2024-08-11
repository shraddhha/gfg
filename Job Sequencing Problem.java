
class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
         Arrays.sort(arr, (a, b) -> b.profit - a.profit);
        
       
        int maxDeadline = 0;
        for (Job job : arr) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }
       
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);
        
        int jobCount = 0;
        int maxProfit = 0;
        
        
        for (Job job : arr) {
           
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;  // Assign job to this slot
                    jobCount++;
                    maxProfit += job.profit;
                    break;
                }
            }
        }
        
        return new int[]{jobCount, maxProfit};
    }
}
 
