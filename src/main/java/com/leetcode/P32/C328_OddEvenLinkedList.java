package com.leetcode.P32;

import com.leetcode.common.ListNode;
/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-27
 */
public class C328_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        while (even != null && even.next != null) {
            ListNode tmp = even.next;
            even.next = tmp.next;
            even = even.next;
            tmp.next = odd.next;
            odd.next = tmp;
            odd = odd.next;
        }
        return head;
    }
}
