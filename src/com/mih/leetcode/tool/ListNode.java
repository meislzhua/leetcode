package com.mih.leetcode.tool;

/**
 * Created by meislzhua on 15/11/4.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode list(int[] list) {
        if (list.length == 0) return null;

        ListNode head = new ListNode(list[list.length - 1]),tmp = null;

        for (int i = list.length - 2; i >= 0; i--) {
            tmp = new ListNode(list[i]);
            tmp.next = head;
            head = tmp;
        }
        return head;
    }

    public static void display(ListNode list){
        while(list != null){
            System.out.print(list.val+"->");
            list = list.next;
        }
        System.out.print("end");
    }
}
