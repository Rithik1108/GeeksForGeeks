class Solution {
    public static int findEquilibrium(int arr[]) {
        int sum = 0;
        for(int i : arr){
            sum=sum+i;
        }
        int l = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum-arr[i];
            if(l==sum){
                return i;
            }
            l=l+arr[i];
        }
        return -1;
    }
}
