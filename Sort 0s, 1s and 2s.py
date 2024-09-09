class Solution:
    # Function to sort an array of 0s, 1s, and 2s
    def sort012(self, arr):
      
        low, mid = 0, 0
        high = len(arr) - 1
        
        while mid <= high:
            if arr[mid] == 0:
                # Swap arr[low] and arr[mid], increment both low and mid
                arr[low], arr[mid] = arr[mid], arr[low]
                low += 1
                mid += 1
            elif arr[mid] == 1:
                # Move mid forward
                mid += 1
            else:
                # Swap arr[mid] and arr[high], decrement high
                arr[mid], arr[high] = arr[high], arr[mid]
                high -= 1
            # code here
