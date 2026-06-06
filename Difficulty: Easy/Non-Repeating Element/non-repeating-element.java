class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int key : arr){
            if(map.get(key)==1){
                return key;
            }
        }
        return 0;
    }
}
