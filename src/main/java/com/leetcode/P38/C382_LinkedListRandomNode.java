package com.leetcode.P38;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-10-10
 */
public class C382_LinkedListRandomNode {
    ListNode head = null;
    Random ra = null;
    public C382_LinkedListRandomNode(ListNode head) {
        this.head = head;
        ra = new Random();
        ra.setSeed(System.currentTimeMillis());
    }

    public int getRandom() {
        int res = head.val;
        ListNode cur = head;
        int i = 1;
        while (cur != null) {
            if (ra.nextInt(i) == 0) {
                res = cur.val;
            }
            cur = cur.next;
            i++;
        }
        return res;
    }
}
