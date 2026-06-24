class Solution {
    public void replaceWithRank(int[] arr) {
        // code here
        int[][] temp = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            temp[i][0]=arr[i];
            temp[i][1]=i;
        }
        Arrays.sort(temp,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<arr.length;i++){
            arr[temp[i][1]]=i;
        }
    }
}