
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
         List<Integer> res=new ArrayList<>();
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        int n=nums.length/3;
        
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> mp:hs.entrySet()){
           if(mp.getValue()>n){
               res.add(mp.getKey());
           }
        }
        return res;
    
    }
}
Majority Element II
