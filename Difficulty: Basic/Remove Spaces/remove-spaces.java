class Solution {
    String removeSpaces(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char r = s.charAt(i);
            if(r!=' '){
                result.append(r);
            }
        }
        return result.toString();
    }
}