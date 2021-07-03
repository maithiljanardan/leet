package org.janardhan.leet.list;

public class LinkedList {

    public ListNode head;

    public LinkedList(ListNode head) {
        this.head = head;
    }

    //Adds node to the start of the list
    public void addNode(int i) {
        ListNode node = new ListNode(i);
        node.next = head;
        head = node;
    }

    public void printList() {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println("");
    }
}
