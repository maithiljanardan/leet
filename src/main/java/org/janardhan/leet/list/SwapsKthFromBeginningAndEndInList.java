package org.janardhan.leet.list;

/**
 * You are given the head of a linked list, and an integer k.
 * <p>
 * Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,2,3,4,5], k = 2
 * Output: [1,4,3,2,5]
 * Example 2:
 * <p>
 * Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
 * Output: [7,9,6,6,8,7,3,0,9,5]
 * Example 3:
 * <p>
 * Input: head = [1], k = 1
 * Output: [1]
 * Example 4:
 * <p>
 * Input: head = [1,2], k = 1
 * Output: [2,1]
 * Example 5:
 * <p>
 * Input: head = [1,2,3], k = 2
 * Output: [1,2,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is n.
 * 1 <= k <= n <= 105
 * 0 <= Node.val <= 100
 */
public class SwapsKthFromBeginningAndEndInList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(new ListNode(5));

        list.addNode(4);
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        list.printList();

        ListNode head = swapNodes(list.head, 2);
        list = new LinkedList(head);
        list.printList();
    }


    public static ListNode swapNodes(ListNode head, int k) {

        int count = 0;

        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        if (k > count)
            return head;
        if (2 * k - 1 == count)
            return head;

        ListNode left = head;
        ListNode left_prev = null;

        for (int i = 1; i < k; i++) {
            left_prev = left;
            left = left.next;
        }

        ListNode right = head;
        ListNode right_prev = null;

        for (int i = 1; i < count - k + 1; i++) {
            right_prev = right;
            right = right.next;
        }
        if (left_prev != null)
            left_prev.next = right;

        if (right_prev != null)
            right_prev.next = left;


        ListNode temp = left.next;
        left.next = right.next;
        right.next = temp;


        if (k == 1)
            head = right;

        if (k == count)
            head = left;

        return head;
    }

}
