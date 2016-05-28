package com.leetcode.P32;

import com.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-29
 */
public class C328_OddEvenLinkedListTest {

    @Test
    public void testOddEvenList() throws Exception {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        C328_OddEvenLinkedList example = new C328_OddEvenLinkedList();
        ListNode res = example.oddEvenList(n1);
        res.printList();
    }



}