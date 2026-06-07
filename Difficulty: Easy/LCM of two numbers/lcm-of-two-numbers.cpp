class Solution {
  public:
    int lcm(int a, int b) {
        // code here
        for(int i=1;i<=a;i++){
            if((b*i)%a==0){
                return b*i;
            }
        }
    }
};