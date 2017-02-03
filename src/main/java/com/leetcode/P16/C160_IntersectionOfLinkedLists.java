package com.leetcode.P16;

import com.leetcode.common.ListNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-03
 */
public class C160_IntersectionOfLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = getLen(headA);
        int lenB = getLen(headB);
        ListNode curA = headA;
        ListNode curB = headB;
        if (lenA > lenB) {
            int count = lenA - lenB;
            while (count-- > 0) {
                curA = curA.next;
            }
        } else {
            int count = lenB - lenA;
            while (count-- > 0) {
                curB = curB.next;
            }
        }
        while (curA != null && curB != null && curA != curB) {
            if (curA == curB) {
                break;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return curA == null ? curA : curB;
    }
    private int getLen(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }
}
