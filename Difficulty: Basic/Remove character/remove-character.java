// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for(char ch : str2.toCharArray()){
            set.add(ch);
        }
        for(char ch : str1.toCharArray()){
            if(!set.contains(ch)){
                res.append(ch);
            }
        }
        return res.toString();
    }
}