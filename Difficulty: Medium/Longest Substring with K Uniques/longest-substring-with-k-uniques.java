class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int low = 0,res = Integer.MIN_VALUE;
        for(int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0) map.remove(s.charAt(low));
                low++;
            }
            if(map.size()==k){
                res = Math.max(res,high-low+1);
            }
        }
        if(res==Integer.MIN_VALUE) return -1;
        return res;
    }
}