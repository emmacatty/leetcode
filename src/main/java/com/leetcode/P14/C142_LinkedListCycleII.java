package com.leetcode.P14;

import com.leetcode.common.ListNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C142_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode step1 = head == null ? null : head.next;
        ListNode step2 = head == null || head.next == null ? null : head.next.next;
        boolean hasCycle = false;
        while (step1 != null && step2 != null && step2.next != null) {
            if (step1 == step2) {
                hasCycle = true;
                break;
            }
            step1 = step1.next;
            step2 = step2.next.next;
        }
        if (!hasCycle) {
            return null;
        }
        step1 = head;
        while (step1 != step2) {
            step1 = step1.next;
            step2 = step2.next;
        }
        return step1;
    }
}
