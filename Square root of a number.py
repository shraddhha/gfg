class Solution:
    def floorSqrt(self, n): 
        #Your code here
        if n == 0 or n == 1:
            return n

        start, end = 1, n
        answer = 0
    
        while start <= end:
            mid = (start + end) // 2
    
            
            if mid * mid == n:
                return mid
       
            if mid * mid < n:
                start = mid + 1
                answer = mid
    
            else:
                end = mid - 1
    
        return answer
