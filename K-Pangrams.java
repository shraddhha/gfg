class Solution {
    boolean kPangram(String str, int k) {
        
        // code here
        HashSet<Character> set = new HashSet<>();
        int n = str.length();
        int count=0;
        if(n<26) return false;
        
        for(int i=0;i<n;i++)
        {
            char ch = str.charAt(i);
            if(ch==' ') continue;
            else
            {
                set.add(ch); 
                count++;
            }
        }
    
        if(count<26) return false;
        if(k+set.size()>=26 || set.size()==26) return true;
     return false;   
    
    }
}
