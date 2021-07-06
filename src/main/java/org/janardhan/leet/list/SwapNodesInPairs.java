package org.janardhan.leet.list;


/**
 * Problem 24 : Medium
 *
 */
public class SwapNodesInPairs {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(new ListNode(4));
        list.addNode(3);
        list.addNode(2);
        list.addNode(1);

        list.printList();

        System.out.println(list.head);

        ListNode node =swapPairs(list.head);

        System.out.println(node);


    }

    public static ListNode swapPairs(ListNode head) {
        ListNode prev = head;
        if(head == null || head.next == null)
            return head;
        head = head.next;
        prev.next = swapPairs(head.next);
        head.next = prev;
        return head;

    }
}
