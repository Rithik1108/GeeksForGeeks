class Solution {
    public static int findMean(int[] arr) {
        // code here
        int sum=0;
        for(int n : arr){
            sum=sum+n;
        }
        return sum/arr.length;
    }
};