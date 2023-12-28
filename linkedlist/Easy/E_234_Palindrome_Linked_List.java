package learn.dsa.linkedlist.easy;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

/*
 * Leetcode - https://leetcode.com/problems/palindrome-linked-list
 * 
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
	
	Example 1:
	
	Input: head = [1,2,2,1]
	Output: true
	
	Example 2:
	
	Input: head = [1,2]
	Output: false
	
	Constraints:
	The number of nodes in the list is in the range [1, 105].
	0 <= Node.val <= 9
	
	Follow up: Could you do it in O(n) time and O(1) space?

 */
public class E_234_Palindrome_Linked_List {
	ListNode head;
	
	public static void main(String[] args) {
		E_234_Palindrome_Linked_List object = new E_234_Palindrome_Linked_List();
		object.add(1);
		object.add(2);
		object.add(2);
		object.add(2);
		
		System.out.println("Result : "+object.isPalindrome(object.head));
	}

	/*
	 * Runtime 4ms Beats 81.43% of users with Java
	 * 
	 * The time complexity of this code is O(n), where n is the number of nodes in the linked list. 
	 * This is because we iterate through the linked list twice - once to find the middle node and once to compare the first half with the reversed second half.
	 * 
	 * The space complexity is O(1) because we are not using any additional data structures that grow with the input size. 
	 * We only use a constant amount of extra space for the slow and fast pointers.
	 */
	public boolean isPalindrome(ListNode head) {
		if(head==null || head.next==null) return true;
		ListNode slow = head;
		ListNode fast = head;

		//Find the middle of LL
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}

		//Reverse the second half LL
		slow=reverseLL(slow);

		//Compare the first half with reversed second half LL
		while(slow!=null){
			if(head.val!=slow.val){
				return false;
			}
			head=head.next;
			slow=slow.next;
		}

		return true;    
	}


	public ListNode reverseLL(ListNode node){
		ListNode prev = null;
		ListNode cur = node;
		while(cur!=null){
			ListNode temp = cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		return prev;
	}
	
	public void add(int new_data) {
		System.out.println("addLast called");
		ListNode newNode = new ListNode(new_data);
		if(head==null) {
			head=newNode;
			return;
		}

		ListNode currNode = head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
	}
}
