class Solution {
    static void reverse(int arr[],int l,int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // code here
        d = d%arr.length-1;
        reverse(arr,0,d);
        reverse(arr,d+1,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
}