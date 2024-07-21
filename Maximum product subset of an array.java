class Solution {
    public long findMaxProduct(List<Integer> arr) {
        // code here
        int MOD = 1000000007;
        int n = arr.size();

       
        if (n == 1) {
            return arr.get(0) % MOD;
        }

        int maxNeg = Integer.MIN_VALUE;
        int countNeg = 0;
        int countZero = 0;
        long product = 1;

        for (int num : arr) {
            if (num == 0) {
                countZero++;
                continue;
            }
            if (num < 0) {
                countNeg++;
                maxNeg = Math.max(maxNeg, num);
            }
            product = (product * num) % MOD;
        }

      
        if (countZero == n) {
            return 0;
        }

        if (countNeg % 2 != 0) {

            if (countNeg == 1 && countZero + countNeg == n) {
                return 0;
            }
     
            product = (product * modInverse(maxNeg, MOD)) % MOD;
        }


        return (product + MOD) % MOD;
    }


    private int modInverse(int a, int m) {
        return power(a, m - 2, m);
    }

    private int power(int x, int y, int m) {
        if (y == 0) {
            return 1;
        }
        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;
        return (y % 2 == 0) ? (int) p : (int) (x * p % m);
    }

    
}
