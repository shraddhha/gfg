class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        HashMap<Integer, Integer> balanceMap = new HashMap<>();
 
        balanceMap.put(0, 1);
        
        int bal = 0;  
        int count = 0;
        
     
        for (int i = 0; i < arr.length; i++) {
         
            if (arr[i] == x) {
                bal += 1;
            } else if (arr[i] == y) {
                bal -= 1;
            }
            
           
            if (balanceMap.containsKey(bal)) {
                count += balanceMap.get(bal);
            }
    
            balanceMap.put(bal, balanceMap.getOrDefault(bal, 0) + 1);
        }
        
        return count;

    }
}
