/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        int c=1;
        Node temp = head;
        if(x==1){
            return head=head.next;
        }
        while(temp!=null && temp.next!=null){
            if(c==x-1){
                temp.next=temp.next.next;
                return head;
            }
            else{
                temp=temp.next;
            }
            c++;
        }
        return head;
    }
}