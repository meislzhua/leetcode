package com.mih.leetcode;

import com.mih.leetcode.tool.ListNode;

/**
 * Created by hack on 16/5/30.
 * <p>
 * <p>
 * Reverse a singly linked list.
 * <p>
 * click to show more hints.
 * <p>
 * Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * <p>
 * Subscribe to see which companies asked this question
 */

public class ReverseLinkedList {
    public ListNode iteratively(ListNode head) {
        if (head == null) return null;
        ListNode tmp = head.next, nextnextNode;
        head.next = null;
        while (tmp != null) {
            nextnextNode = tmp.next;
            tmp.next = head;
            head = tmp;
            tmp = nextnextNode;
        }
        return head;
    }

    public ListNode recursively(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode next = head.next;
        ListNode rh = recursively(next);
        head.next = null;
        next.next = head;
        return rh;
    }

    public ListNode reverseList(ListNode head) {
        return recursively(head);
    }

    public static void main(String[] args) {
        ListNode.display(new ReverseLinkedList().reverseList(ListNode.list(new int[]{1, 2, 3, 4})));
    }
}
