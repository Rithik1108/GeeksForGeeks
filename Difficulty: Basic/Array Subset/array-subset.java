
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : a){
            if(!map.containsKey(n)){
                map.put(n,1);
            }    
            else{
                map.put(n,map.get(n)+1);
            }
        }
        for(int n : b){
            if(!map.containsKey(n) || map.get(n)<1){
                return false;
            }
            else{
                map.put(n,map.get(n)-1);
            }
        }
        return true;
    }
}
