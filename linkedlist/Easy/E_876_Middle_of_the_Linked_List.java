package learn.dsa.linkedlist.easy;

/*
 * Leetcode - https://leetcode.com/problems/middle-of-the-linked-list/
 * 
 * Given the head of a singly linked list, return the middle node of the linked list.
	If there are two middle nodes, return the second middle node.
	
	Example 1:
	
	Input: head = [1,2,3,4,5]
	Output: [3,4,5]
	Explanation: The middle node of the list is node 3.
	
	Example 2:
	
	Input: head = [1,2,3,4,5,6]
	Output: [4,5,6]
	Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
	
	Constraints:
	The number of nodes in the list is in the range [1, 100].
	1 <= Node.val <= 100
 */
public class E_876_Middle_of_the_Linked_List {
	/*
	 * Youtube - https://www.youtube.com/watch?v=7LjQ57RqgEc
	 * 
	 * Runtime 0ms Beats 100.00% of users with Java
	 *
	 *The time complexity of this code is O(n), where n is the number of nodes in the linked list. 
	 *This is because we iterate through the linked list once, with the fast pointer moving twice as fast as the slow pointer.
	 *
	 *The space complexity is O(1) because we are only using a constant amount of extra space to store the fast and slow pointers.
	 */
	public ListNode middleNode(ListNode head) {
		if(head==null || head.next==null) return head;

		ListNode fast = head;
		ListNode slow = head;

		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}
