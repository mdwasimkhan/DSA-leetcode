package learn.dsa.linkedlist.easy;

/*
 * Leetcode - https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
	For example, the following two linked lists begin to intersect at node c1:
	The test cases are generated such that there are no cycles anywhere in the entire linked structure.
	Note that the linked lists must retain their original structure after the function returns.

	Custom Judge:
	The inputs to the judge are given as follows (your program is not given these inputs):

	intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
	listA - The first linked list.
	listB - The second linked list.
	skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
	skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
	The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.

	Example 1:

	Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
	Output: Intersected at '8'
	Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
	From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
	- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.

	Example 2:

	Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
	Output: Intersected at '2'
	Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect).
	From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.

	Example 3:

	Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
	Output: No intersection
	Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
	Explanation: The two lists do not intersect, so return null.

	Constraints:

	The number of nodes of listA is in the m.
	The number of nodes of listB is in the n.
	1 <= m, n <= 3 * 104
	1 <= Node.val <= 105
	0 <= skipA < m
	0 <= skipB < n
	intersectVal is 0 if listA and listB do not intersect.
	intersectVal == listA[skipA] == listB[skipB] if listA and listB intersect.
 */
public class E_160_Intersection_of_Two_Linked_Lists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		/*
		 * Runtime 1ms Beats 99.00% of users with Java
		 * 
		 * The time complexity of this code is O(n+m), where n is the length of the first linked list and m is the length of the second linked list. 
		 * This is because we iterate through both linked lists simultaneously until we find the intersection node or reach the end of both lists.
		 * 
		 * The space complexity is O(1) because we are using a constant amount of extra space to store the two pointers (n1 and n2) and the intersection node. 
		 * We are not using any additional data structures that grow with the input size.
		 * 
		 */
		if(headA ==null || headB == null){
			return null;
		}

		ListNode n1 = headA;
		ListNode n2 = headB;

		while(n1!=n2){
			if(n1==null){
				n1=headB;                
			}else{
				n1=n1.next;
			}
			if(n2==null){
				n2=headA;                
			}else{
				n2=n2.next;
			}
		}

		return n1;



		/*
		 * Runtime 1097ms Beats 5.23% of users with Java
		 * 
		 * The time complexity of this code is O(m + n), where m is the length of the linked list headA and n is the length of the linked list headB. 
		 * This is because we iterate through both linked lists once to create the list of nodes and then iterate through the second linked list to check for intersection.
		 * 
		 * The space complexity is O(m), where m is the length of the linked list headA. This is because we store all the nodes of headA in the list.
		 * 
		 */
		// List<ListNode> list = new ArrayList<ListNode>();

		// ListNode nodeA=headA;
		// ListNode nodeB=headB;

		// while(nodeA!=null){
		//     list.add(nodeA);
		//     nodeA=nodeA.next;
		// }
		// while(nodeB!=null){
		//     if(list.contains(nodeB)){
		//         return nodeB;
		//     }
		//     nodeB=nodeB.next;
		// }
		// return null;
	}
}
