// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp=head;
        
        while(temp!=null){
            if(temp.data==x){
                if(temp==head){
                    head=head.next;
                    if(head!=null){
                        head.prev=null;
                    }
                    temp=head;
                }
                else{
                    Node prevnode=temp.prev;
                    Node nextnode=temp.next;
                    
                    if(nextnode!=null){
                        nextnode.prev=prevnode;
                    }
                    if(prevnode!=null){
                        prevnode.next=nextnode;
                    }
                    temp=temp.next;
                }
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}