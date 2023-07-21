//LeetCode problem uploading only logic
// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseNode {
	public static ListNode reverseKGroup(ListNode head, int k) {
		 if (head==null || k==1){
			 return head;
	     }
	     ListNode temp=new ListNode(0);
	     temp.next=head;
	     int len=0;
	     ListNode current=head;
	     while(current!=null){
	           len+=1;
	           current=current.next;
	     }
	     ListNode previous=temp;
	     ListNode begin=head;
	     ListNode end=head;
	     ListNode nextNode=null;
	      while(len>=k){
	    	  for(int i=1;i<k;i++){
	              end=end.next;
	          }
	          nextNode=end.next;
	          end.next=null;
	          previous.next=reverse(begin);
	          begin.next=nextNode;
	          previous=begin;
	          begin=nextNode;
	          end=begin;
	          len-=k;
	      }
	      return temp.next;
	        
	}
	private static ListNode reverse(ListNode head){
		 ListNode previous=null;
	     ListNode current=head;
	     while(current!=null){
	          ListNode next=current.next;
	          current.next=previous;
	          previous=current;
	          current=next;
	     }
	     return previous;
	 }
	
}


