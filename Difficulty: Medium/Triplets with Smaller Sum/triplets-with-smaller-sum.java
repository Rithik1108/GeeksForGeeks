class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
        Arrays.sort(arr);
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int s = arr[i]+arr[j]+arr[k];
                if(s>=sum){
                    k--;
                }
                else{
                    count=count+k-j;
                    j++;
                }
            }
        }
        return count;
    }
}