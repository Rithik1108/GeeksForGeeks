// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        int c=0;
        for(char s:S.toCharArray()){
            if(Character.isLetter(s)){
                c=c+1;
            }
        }
        return c;
        
    }
}