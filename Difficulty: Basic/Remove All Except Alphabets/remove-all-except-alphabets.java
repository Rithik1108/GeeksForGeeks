class Solution {
    public String removeChars(String s) {
        // code here
        return s.replaceAll("[^a-zA-Z]","");
    }
};