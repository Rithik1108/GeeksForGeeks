class Solution {
    
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int res = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
            if(sum>res) res = sum;
        }
        for(int i=1,j=i+k-1;j<arr.length;i++,j++){
            sum=sum-arr[i-1]+arr[j];
            if(sum>res) res = sum;
        }
        return res;
    }
}