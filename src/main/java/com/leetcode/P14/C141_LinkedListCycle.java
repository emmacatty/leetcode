package com.leetcode.P14;

import com.leetcode.common.ListNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode step1 = head;
        ListNode step2 = head.next;
        boolean res = false;
        while (step1 != null && step2 != null && step2.next != null) {
            if (step1 == step2) {
                res = true;
                break;
            }
            step1 = step1.next;
            step2 = step2.next.next;
        }
        return res;
    }
}
