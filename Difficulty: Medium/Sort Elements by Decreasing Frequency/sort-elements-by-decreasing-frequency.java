class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue()-a.getValue();
            }
            return a.getKey()-b.getKey();
        });
        for(Map.Entry<Integer,Integer> entry : list){
            int count = entry.getValue();
            while(count-- > 0){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}