class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
      
        for (int num : arr) {
            if (num >= 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
     
        arr.clear();
        int i = 0, j = 0;
        
    
        while (i < positive.size() && j < negative.size()) {
            arr.add(positive.get(i));
            arr.add(negative.get(j));
            i++;
            j++;
        }
        
   
        while (i < positive.size()) {
            arr.add(positive.get(i));
            i++;
        }
        
   
        while (j < negative.size()) {
            arr.add(negative.get(j));
            j++;
        }
    
    }
}
