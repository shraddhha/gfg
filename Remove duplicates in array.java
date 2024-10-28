
class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        
        // Add each element to the LinkedHashSet (duplicates are ignored)
        for (int num : arr) {
            uniqueElements.add(num);
        }
        
        // Convert the set to a list to get the final result
        return new ArrayList<>(uniqueElements);
    }
}
