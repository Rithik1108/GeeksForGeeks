class Solution {
    
    public int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    
    public boolean isStrong(int n) {
        // code here
        int temp = n;
        int sum=0;
        while(temp>0){
            int r=temp%10;
            temp=temp/10;
            sum=fact(r)+sum;
        }
        if(sum==n) return true;
        return false;
    }
}