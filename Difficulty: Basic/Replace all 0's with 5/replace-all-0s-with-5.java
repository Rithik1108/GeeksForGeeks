class Solution {
    int convertfive(int num) {
        // Your code here
        if(num==0) return 5;
        int res=0;
        int i=0;
        while(num>0){
            int r = num%10;
            if(r==0) r=5;
            num=num/10;
            res=res+r*(int)Math.pow(10,i);
            i++;
        }
        return res;
    }
}