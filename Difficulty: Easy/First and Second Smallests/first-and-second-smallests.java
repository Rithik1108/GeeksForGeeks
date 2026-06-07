class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int s=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int n : arr){
            if(n<s){
                ss=s;
                s=n;
            }
            if(n>s && n<ss){
                ss=n;
            }
        }
        if(ss!=Integer.MAX_VALUE){
            list.add(s);
            list.add(ss);
            return list;
        }
        list.add(-1);
        return list;
    }
}
