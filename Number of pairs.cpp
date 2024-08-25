class Solution {
  public:
    long long countPairs(vector<int> &arr, vector<int> &brr) {
        // Your Code goes here.
          sort(brr.begin(), brr.end());

        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        for (int y : brr) {
            if (y == 1) count1++;
            if (y == 2) count2++;
            if (y == 3) count3++;
            if (y == 4) count4++;
        }

        long long totalPairs = 0;

        for (int x : arr) {
            if (x == 1) continue;  // Skip x = 1

            // Find the position where elements in brr are greater than x
            auto it = upper_bound(brr.begin(), brr.end(), x);
            totalPairs += (brr.end() - it);

            // Handle special cases
            if (x == 2) {
                totalPairs += count1;      // 2^1 > 1^2
                totalPairs -= count3 + count4;  // 2^3 < 3^2 and 2^4 == 4^2
            } else if (x == 3) {
                totalPairs += count1 + count2;  // 3^1 > 1^3 and 3^2 > 2^3
            } else {
                totalPairs += count1;  // For x > 3, only pairs with y = 1 satisfy the condition
            }
        }

        return totalPairs;
    }
};
