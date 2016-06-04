package com.leetcode.P20;

import com.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-03
 */
public class C206_ReverseLinkedListTest {

    @Test
    public void testReverseList() throws Exception {
        C206_ReverseLinkedList example = new C206_ReverseLinkedList();
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        ListNode res = example.reverseList(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}