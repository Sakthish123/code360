import java.util.* ;
import java.io.*; 
/*
    Time Complexity : O(K)
    Space Complexity : O(1)

    Where, K is the position of the node to be inserted in the list.
*/

/************************************************************

 Following is the linkedList class structure:

 class Node<T> {
 T data;
 Node<T> next;

 public Node(T data) {
 this.data = data;
 }
 }

 ************************************************************/

public class Solution {

    static Node insert(int k, int val, Node head) {
        Node n=new Node(val);
        Node h=head;
        int check=0;
        while(true){
            if(k==0){
               n.next=head.next;
               head.next=n;
               int t=n.data;
               n.data=head.data;
               head.data=t;
               if(h==head&&check==1)
                 h=h.next;
               break;
            }
            k--;
            check=1;
            head=head.next;
        }
        
          return h;
        
    }
}
