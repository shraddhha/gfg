class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code 
        int sz = arr.size(); 

        for (int k = 1; k <= sz / 2; k++) {
           
            int lastElement = arr.remove(arr.size() - 1); // Removing the last element
            arr.add(0, lastElement); // Inserting the last element at the front

          
            int n = arr.size();
            int indexToDelete = n - k;
            arr.remove(indexToDelete); 
        }

      
        return arr.get(0);
    

    }
}
