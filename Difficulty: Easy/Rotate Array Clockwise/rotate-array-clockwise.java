class Solution {
    public void reverse(int arr[],int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r]=temp;
            l++;
            r--;
            }
    }
    public void rotateclockwise(int[] arr, int k) {
        // code here
        k=k%arr.length;
        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
}