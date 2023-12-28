package learn.dsa.linkedlist.easy;

/*
 * Leetcode - https://leetcode.com/problems/remove-duplicates-from-sorted-list
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
	Example 1:
	
	Input: head = [1,1,2]
	Output: [1,2]
	
	Example 2:
	
	Input: head = [1,1,2,3,3]
	Output: [1,2,3]
	
	Constraints:
	The number of nodes in the list is in the range [0, 300].
	-100 <= Node.val <= 100
	The list is guaranteed to be sorted in ascending order.
 */
class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class E_83_Remove_Duplicates_from_Sorted_List {
	/*
	 * The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list. 
	 * This is because we iterate through each node in the linked list once.
	 * 
	 * The space complexity is O(1) because we are not using any additional data structures that grow with the input size. 
	 * We are only using a constant amount of space to store the current node and its next node.
	 */
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null){
			return head;
		}
		ListNode node = head;
		while(node.next!=null){
			if(node.val==node.next.val){
				node.next=node.next.next;
			}else{
				node=node.next;
			}
		}
		return head;
	}
}
