/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    int min = Integer.MAX_VALUE;
    int minValue(Node root) {
        // code here
        if(root == null){
            return min;
        }
        if(root.data<min){
            min = root.data;
        }
        minValue(root.left);
        minValue(root.right);
        return min;
    }
}