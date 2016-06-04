package com.leetcode.P20;

import com.leetcode.common.ListNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-03
 */
public class C206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode node = head;
        ListNode next = head;
        while (node != null) {
            next = node.next;
            node.next = dummy.next;
            dummy.next = node;
            node = next;
        }
        return dummy.next;
    }
}
