class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
          HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : frequencyMap.keySet()) {
            if (k == 0) {
                // For k = 0, count pairs within the same element
                int freq = frequencyMap.get(num);
                count += freq * (freq - 1) / 2; // nC2 = n * (n - 1) / 2
            } else {
                // For k != 0, check if the pair (num, num + k) exists
                if (frequencyMap.containsKey(num + k)) {
                    count += frequencyMap.get(num) * frequencyMap.get(num + k);
                }
            }
        }

        return count;
    }
}
