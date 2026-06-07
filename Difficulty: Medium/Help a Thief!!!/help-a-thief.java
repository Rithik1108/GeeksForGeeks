class Solution {
    static int maxCoins(int[] A, int[] B, int T, int N) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            ArrayList<Integer> l = new ArrayList<>();
            l.add(A[i]);
            l.add(B[i]);
            list.add(l);
        }
        list.sort((a,b)->b.get(1)-a.get(1));
        int res=0;
        for(int i=0;i<N;i++){
            int take = Math.min(T,list.get(i).get(0));
            T=T-take;
            res = res+(take*list.get(i).get(1));
        }
        return res;
    }
}