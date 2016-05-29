package com.mih.leetcode;

import com.mih.leetcode.tool.ListNode;

/**
 * Created by meislzhua on 15/11/4.
 */
public class DeleteNodeInALinkedList {
	public void deleteNode(ListNode node) {
		//normal
		//83 / 83 test cases passed.1 ms 5.02%
		ListNode nextNode = node.next;
		if(node == null || nextNode == null) return;
		while(nextNode.next != null){
			node.val = nextNode.val;
			node = nextNode;
			nextNode = nextNode.next;
		}
		node.val = nextNode.val;
		node.next = null;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		listNode.next =new ListNode(2);
		listNode.next.next =new ListNode(3);
		listNode.next.next.next =new ListNode(4);
		listNode.next.next.next.next =new ListNode(5);
		listNode.next.next.next.next.next =new ListNode(6);

		new  DeleteNodeInALinkedList().deleteNode(listNode.next);
		while(listNode !=null){
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
}
