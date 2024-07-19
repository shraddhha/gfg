class Solution {
    private class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(arr[i], i);
        }
        mergeSortAndCount(pairs, 0, n - 1, result);
        return result;
    }

    private void mergeSortAndCount(Pair[] pairs, int left, int right, int[] result) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSortAndCount(pairs, left, mid, result);
        mergeSortAndCount(pairs, mid + 1, right, result);
        merge(pairs, left, mid, right, result);
    }

    private void merge(Pair[] pairs, int left, int mid, int right, int[] result) {
        int n = right - left + 1;
        Pair[] temp = new Pair[n];
        int i = left, j = mid + 1, k = 0;
        int rightCounter = 0;

        while (i <= mid && j <= right) {
            if (pairs[i].value > pairs[j].value) {
                rightCounter++;
                temp[k++] = pairs[j++];
            } else {
                result[pairs[i].index] += rightCounter;
                temp[k++] = pairs[i++];
            }
        }

        while (i <= mid) {
            result[pairs[i].index] += rightCounter;
            temp[k++] = pairs[i++];
        }

        while (j <= right) {
            temp[k++] = pairs[j++];
        }

        for (i = left; i <= right; i++) {
            pairs[i] = temp[i - left];
        }
    }
}
