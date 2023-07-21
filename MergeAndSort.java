import java.util.Scanner;
class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val=val;
	}
}
public class MergeAndSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Linked-List1 :");
		String[] arr1=sc.nextLine().split("->");
		ListNode head1=null;
		ListNode tail1=null;
		for(String arr : arr1) {
			int val=Integer.parseInt(arr);
			ListNode node1=new ListNode(val);
			if(head1==null) {
				head1=node1;
				tail1=node1;
			}else {
				tail1.next=node1;
				tail1=node1;
			}
		}
		System.out.print("Linked-List2 :");
		String[] arr2=sc.nextLine().split("->");
		ListNode head2=null;
		ListNode tail2=null;
		for(String arr : arr2) {
			int val=Integer.parseInt(arr);
			ListNode node1=new ListNode(val);
			if(head2==null) {
				head2=node1;
				tail2=node1;
			}else {
				tail2.next=node1;
				tail2=node1;
			}
		}
		sc.close();
		ListNode merged=mergedList(head1,head2);
		ListNode sort=sortedList(merged);
		ListNode current=sort;
		while(current!=null) {
			System.out.print(current.val+"->");
			current=current.next;
		}
		
		
	}
	public static ListNode mergedList(ListNode head1, ListNode head2) {
        ListNode head = new ListNode(-1);
        ListNode current = head;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return head.next;
    }

    public static ListNode sortedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = findMiddleElement(head);
        ListNode second = mid.next;
        mid.next = null;

        ListNode firstHalf = sortedList(head);
        ListNode secondHalf = sortedList(second);

        return merge(firstHalf, secondHalf);
    }

    public static ListNode findMiddleElement(ListNode head) {
        ListNode low = head;
        ListNode high = head;

        while (high != null && high.next != null && high.next.next != null) {
            low = low.next;
            high = high.next.next;
        }

        return low;
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode current = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return head.next;
    }
}



