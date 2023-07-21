import java.util.Scanner;
class ListNode {
	int val;
	ListNode next;

	    public ListNode(int val) {
	        this.val = val;
	    }
	}
public class RemoveDuplicates {
	public static ListNode removeDuplicates(ListNode head) {
		if (head == null)
	         return null;
		ListNode current = head;
	    while (current != null) {
	    	ListNode temp = current;
	        while (temp.next != null) {
	        	if (temp.next.val == current.val) {
	        		temp.next = temp.next.next;
	            } else {
	                temp = temp.next;
	                }
	            }
	        	current = current.next;
	        }
	    	return head;
	    }
	public static void print(ListNode head) {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val+"->");
	            current = current.next;
	        }
	        System.out.print("null");
	        
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Linked-List :");
		String[] arr1=sc.nextLine().split("->");
		ListNode head=null;
		ListNode tail=null;
		for(String arr : arr1) {
			int val=Integer.parseInt(arr);
			ListNode node1=new ListNode(val);
			if(head==null) {
				head=node1;
				tail=node1;
			}else {
				tail.next=node1;
				tail=node1;
			}
		}
	    head = removeDuplicates(head);
	    print(head);
	    }
	}


