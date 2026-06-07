class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int lcm=0;
        for(int i=1;i<=a;i++){
            if((b*i)%a==0){
                lcm = b*i;
                break;
            }
        }
        return new int[]{lcm,(a*b)/lcm};
    }
}