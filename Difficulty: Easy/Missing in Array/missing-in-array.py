#User function Template for python3
class Solution:
    def missingNumber(self, arr):
        l=len(arr)+1
        sum1=(l*(l+1))//2
        sum2=sum(arr)
        missing=sum1-sum2
        return missing
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

t = int(input())
for _ in range(0, t):
    arr = list(map(int, input().split()))
    s = Solution().missingNumber(arr)
    print(s)

    print("~")
# } Driver Code Ends