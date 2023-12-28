package learn.dsa.linkedlist.easy;

/*
 * Leetcode - https://leetcode.com/problems/merge-two-sorted-lists
 * 
 * You are given the heads of two sorted linked lists list1 and list2.
	Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
	Return the head of the merged linked list.
	
	Example 1:
	
	Input: list1 = [1,2,4], list2 = [1,3,4]
	Output: [1,1,2,3,4,4]
	
	Example 2:
	
	Input: list1 = [], list2 = []
	Output: []
	
	Example 3:
	
	Input: list1 = [], list2 = [0]
	Output: [0]
	
	Constraints:
	The number of nodes in both lists is in the range [0, 50].
	-100 <= Node.val <= 100
	Both list1 and list2 are sorted in non-decreasing order.
 */
public class E_21_Merge_Two_Sorted_Lists {
	
	   public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		   /*
		    * Runtime 0ms Beats 100.00% of users with Java
		    * Memory 42.58 MB Beats 6.33% of users with Java
		    * 
		    * The time complexity of this code is O(n + m), where n and m are the lengths of list1 and list2 respectively. 
		    * This is because in each recursive call, we are either moving to the next node in list1 or list2, until we reach the end of one of the lists.
		    * 
		    * The space complexity is O(n + m) as well, because in each recursive call, we are creating a new stack frame to store the function call and its variables. 
		    * This means that at any given time, there can be at most n + m stack frames on the call stack.
		    */
	        if(list1==null){
	            return list2;
	        }
	        if(list2==null){
	            return list1;
	        }

	        if(list1.val<=list2.val){
	            list1.next=mergeTwoLists(list1.next, list2);
	            return list1;
	        }else{
	            list2.next=mergeTwoLists(list1, list2.next);
	            return list2;
	        }    

	        /*
	         * Runtime 0ms Beats 100.00% of users with Java
	         * Memory 41.50 MB Beats 51.37% of users with Java
	         * The time complexity of this function is O(n + m), where n and m are the lengths of list1 and list2 respectively. 
	         * This is because we iterate through both lists once in the while loop, comparing and merging the nodes.
	         * 
	         * The space complexity is O(1) because we only use a constant amount of extra space to store the dummy node and the tail pointer.
	         */
	        
	        // ListNode dummy = new ListNode(0);
	        // ListNode tail = dummy;
	        // while(true){
	        //     if(list1==null){
	        //         tail.next=list2;
	        //         break;
	        //     }
	        //     if(list2==null){
	        //         tail.next=list1;
	        //         break;
	        //     }
	        //     if(list1.val<=list2.val){
	        //         tail.next=list1;
	        //         list1=list1.next;
	        //     }else{
	        //         tail.next=list2;
	        //         list2=list2.next;
	        //     }
	        //     tail=tail.next;
	        // }
	        // return dummy.next;
	    }
}
