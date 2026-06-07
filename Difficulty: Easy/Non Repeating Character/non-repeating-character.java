class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        for(char c : s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '$';
    }
}
