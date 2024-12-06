
// User function Template for Java
class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here\
         Arrays.sort(citations);
        
        int n = citations.length;
        int hIndex = 0;

        // Traverse the sorted array to find the H-index
        for (int i = 0; i < n; i++) {
            // Number of papers with at least citations[i] citations
            int papersWithAtLeastCitations = n - i;
            
            // Check if the current paper's citation count satisfies H-index condition
            if (citations[i] >= papersWithAtLeastCitations) {
                hIndex = papersWithAtLeastCitations;
                break;
            }
        }

        return hIndex;
    }
}
