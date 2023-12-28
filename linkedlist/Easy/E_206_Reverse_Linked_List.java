package learn.dsa.linkedlist.easy;

/*
 * Leetcode - https://leetcode.com/problems/reverse-linked-list
 * 
 * Given the head of a singly linked list, reverse the list, and return the reversed list.

	Example 1:

	Input: head = [1,2,3,4,5]
	Output: [5,4,3,2,1]

	Example 2:

	Input: head = [1,2]
	Output: [2,1]

	Example 3:

	Input: head = []
	Output: []

	Constraints:
	The number of nodes in the list is the range [0, 5000].
	-5000 <= Node.val <= 5000

	Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class E_206_Reverse_Linked_List {
	/*
	 * Youtube - https://www.youtube.com/watch?v=ugQ2DVJJroc
	 * The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list. 
	 * This is because we iterate through each node in the linked list once.
	 * The space complexity is O(1) because we only use a constant amount of extra space to store the previous node and temporary variables.
	 * Runtime 0ms Beats 100.00% of users with Java
	 */
	//Iteration
	 public ListNode reverseList(ListNode head) {
	     ListNode cur = head;
	     ListNode prev = null;
	     while(cur!=null){
	         ListNode temp = cur.next;
	         cur.next = prev;
	         prev=cur;
	         cur=temp;
	     }
	     return prev;
	 }

	/*
	 * The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list. 
	 * This is because the algorithm recursively traverses the entire linked list once.
	 * The space complexity of this algorithm is O(n), where n is the number of nodes in the linked list. 
	 * This is because the algorithm uses recursion, which requires additional space on the call stack for each recursive call. 
	 * In the worst case, the call stack can have a maximum depth of n, resulting in O(n) space complexity.
	 * Runtime 0ms Beats 100.00% of users with Java
	 */
	//Recursion
	public ListNode reverseList1(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}

		ListNode newHead = reverseList1(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
}
