class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int s = Integer.MIN_VALUE;
        int ss = Integer.MIN_VALUE;
        
        for(int n : arr){
            if(n>s){
                ss=s;
                s=n;
            }
            if(n>ss && n<s){
                ss=n;
            }
        }
        if(ss!=Integer.MIN_VALUE){
            return ss;
        }
        return -1;
    }
}