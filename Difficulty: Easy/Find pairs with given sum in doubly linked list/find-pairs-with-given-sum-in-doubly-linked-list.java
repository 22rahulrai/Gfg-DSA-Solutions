/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGi(int target,
                                                                      Node head) {
        // code here
        
        Node temp=head;
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        while(temp!=null && temp.next!=null){
            int find=target-temp.data;
            Node findnode=temp.next;
            
            while(findnode!=null){
                if(findnode.data==find){
                    ArrayList<Integer> ans=new ArrayList<>();
                    ans.add(temp.data);
                    ans.add(findnode.data);
                    result.add(ans);
                }
                findnode=findnode.next;
            }
            temp=temp.next;
        }
        
        return result;
    }
    
    
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,Node head) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        Node start=head;
        Node end=findTail(head);
        
        while(start.data<end.data){
            int sum=start.data+end.data;
            
            if(sum==target){
                result.add(new ArrayList<>(Arrays.asList(start.data,end.data)));
                start=start.next;
                end=end.prev;
            }
            else if(sum>target){
                end=end.prev;
            }
            else{
                start=start.next;
            }
        }
        
        return result;
    }
    
    private static Node findTail(Node head) {
        Node temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
        }
        
        return temp;
    }
    
}
