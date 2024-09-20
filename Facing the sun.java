
class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int count = 0;  
        int max_height = Integer.MIN_VALUE;  

       
        for (int h : height) {
            if (h > max_height) {  
                count++;  
                max_height = h; 
            }
        }

        return count; 
    
    }
}
