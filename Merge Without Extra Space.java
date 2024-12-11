class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here'
        int n = a.length;
        int m = b.length;
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i, j;
            
            for (i = 0; i + gap < n; i++) {
                if (a[i] > a[i + gap]) {
       
                    int temp = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = temp;
                }
            }


            for (j = Math.max(0, gap - n); i < n && j < m; i++, j++) {
                if (a[i] > b[j]) {
     
                    int temp = a[i];
                    a[i] = b[j];
                    b[j] = temp;
                }
            }


            for (j = 0; j + gap < m; j++) {
                if (b[j] > b[j + gap]) {

                    int temp = b[j];
                    b[j] = b[j + gap];
                    b[j + gap] = temp;
                }
            }

       
            gap = nextGap(gap);
        }
    }


    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap + 1) / 2;
    
    }
}
