class Solution {
    public int findSum(String s) {
        // code here
        int sum = 0;
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                str.append(ch);
            }
            else{
                if(str.length()>0){
                    int num = Integer.parseInt(str.toString());
                    sum=sum+num;
                    str.setLength(0);
                }
            }
        }
        if(str.length()>0) sum=sum+Integer.parseInt(str.toString());
        return sum;
    }
}