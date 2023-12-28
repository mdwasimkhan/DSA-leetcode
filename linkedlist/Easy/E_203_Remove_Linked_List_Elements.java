package learn.dsa.linkedlist.easy;

/*
 * Leetcode - https://leetcode.com/problems/remove-linked-list-elements/
 * 
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

	Example 1:

	Input: head = [1,2,6,3,4,5,6], val = 6
	Output: [1,2,3,4,5]

	Example 2:

	Input: head = [], val = 1
	Output: []

	Example 3:

	Input: head = [7,7,7,7], val = 7
	Output: []

	Constraints:
	The number of nodes in the list is in the range [0, 104].
	1 <= Node.val <= 50
	0 <= val <= 50
 */
public class E_203_Remove_Linked_List_Elements {
	/*
	 * Runtime 1ms Beats 92.74% of users with Java
	 * 
	 * The time complexity of this algorithm is O(n), where n is the number of nodes in the linked list. 
	 * This is because we iterate through each node in the linked list once.
	 * 
	 * The space complexity is O(1) because we are not using any additional data structures that grow with the input size. 
	 * We only use a constant amount of extra space to store the dummy node and the tail pointer.
	 * 
	 */
	public ListNode removeElements(ListNode head, int val) {
		if(head==null) return null;
		ListNode dummy = new ListNode(0);
		dummy.next=head;

		ListNode tail = dummy;

		while(tail!=null && tail.next!=null){
			if(tail.next.val==val){
				tail.next=tail.next.next;
			}else{
				tail=tail.next;
			}
		}
		return dummy.next;
	}
	
    /*
     * Runtime 0ms Beats 100.00% of users with Java
     * 
     * The time complexity of this code is O(n), where n is the number of nodes in the linked list. 
     * This is because the code uses recursion to traverse through each node in the linked list, and in the worst case scenario, it needs to visit each node once.
     * 
     * The space complexity of this code is O(n), where n is the number of nodes in the linked list. 
     * This is because the code uses recursion, and each recursive call adds a new frame to the call stack. 
     * In the worst case scenario, the call stack will have n frames, one for each node in the linked list.
     * 
     */
    public ListNode removeElements1(ListNode head, int val) {
        if(head==null) return null;
        head.next=removeElements(head.next, val);
        return head.val==val?head.next:head;
    }
}
