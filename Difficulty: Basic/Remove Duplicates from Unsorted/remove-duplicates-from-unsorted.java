class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int n:arr){
            if(!set.contains(n)){
                list.add(n);
                set.add(n);
            }
        }
        return list;
    }
}