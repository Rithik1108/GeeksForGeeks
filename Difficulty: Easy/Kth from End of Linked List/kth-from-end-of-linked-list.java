/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        Node temp = head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count<k){
            return -1;
        }
        count=count-k+1;
        temp=head;
        while(count>1){
            temp=temp.next;
            count--;
        }
        return temp.data;
    }
}