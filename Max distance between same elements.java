HashMap<Integer, Integer> firstOccurrence = new HashMap<>();
        int maxDist = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (!firstOccurrence.containsKey(arr[i])) {
                // Record the first occurrence of the element
                firstOccurrence.put(arr[i], i);
            } else {
                // Calculate the distance and update maxDist
                maxDist = Math.max(maxDist, i - firstOccurrence.get(arr[i]));
            }
        }

        return maxDist;
