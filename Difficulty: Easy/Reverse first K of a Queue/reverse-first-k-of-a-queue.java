class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(q==null || k>q.size() || k<=0){
            return q;
        }
        
        Stack<Integer> stack = new Stack<>();
        
        int n=q.size();
        
        for(int i=0;i<k;i++){
            stack.push(q.remove());
        }
        
        for(int i=0;i<k;i++){
            q.add(stack.pop());
        }
        
        for(int i=0;i<n-k;i++){
            q.add(q.remove());
        }
        
        return q;
        
    }
}