/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/
/*
    Print elements of a linked list on console
    Head pointer input could be NULL as well for empty list
*/

class Solution {
    public List<Integer> printList(Node head) {
        // code here
        List<Integer> l = new ArrayList<>();
        while(head!=null){
            l.add(head.data);
            head=head.next;
        }
        return l;
    }
}