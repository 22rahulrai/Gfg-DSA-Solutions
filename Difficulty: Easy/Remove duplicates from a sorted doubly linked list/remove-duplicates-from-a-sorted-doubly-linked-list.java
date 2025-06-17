// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head==null){
            return null;
        }
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            Node nextnode=temp.next;
            while(nextnode!=null && nextnode.data==temp.data){
                nextnode=nextnode.next;
            }
            temp.next=nextnode;
            if(nextnode!=null){
                nextnode.prev=temp;
            }
            
            temp=temp.next;
        }
        
        return head;
    }
}