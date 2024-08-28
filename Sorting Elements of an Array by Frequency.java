class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a list from the array for custom sorting
        ArrayList<Integer> sortedList = new ArrayList<>();
        for (int num : arr) {
            sortedList.add(num);
        }

        // Step 3: Sort the list using a custom comparator
        Collections.sort(sortedList, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int freqA = frequencyMap.get(a);
                int freqB = frequencyMap.get(b);
                
                // Primary sort: By frequency in descending order
                if (freqA != freqB) {
                    return freqB - freqA;
                }
                // Secondary sort: By value in ascending order if frequencies are the same
                return a - b;
            }
        });

        return sortedList;

    }
}
