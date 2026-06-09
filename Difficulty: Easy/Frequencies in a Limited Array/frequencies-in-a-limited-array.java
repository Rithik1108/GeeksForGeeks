class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else{
                map.put(n,map.get(n)+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            list.add(map.getOrDefault(i,0));
        }
        return list;
    }
}
