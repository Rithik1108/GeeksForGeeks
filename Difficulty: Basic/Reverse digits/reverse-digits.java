class Solution {
    public int reverseDigits(int n) {
        // Code here
        int res=0;
        while(n>0){
            int r=n%10;
            n=n/10;
            res = r+res*10;
        }
        return res;
    }
}