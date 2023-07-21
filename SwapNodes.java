// leetCode problem only logic will be uploaded
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class SwapNodes {
	public static ListNode swapPairs(ListNode head) {
	    if(head==null ||head.next==null){
	          return head;
	    }
	    ListNode first=head;
	    ListNode second=head.next;
	    first.next=swapPairs(second.next);
	    second.next=first;
	    return second;
	    }
	    
	}


