package com.leetcode.P10;

import com.leetcode.common.ListNode;
import com.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-08
 */
public class C109_ConvertSortedList2BSTTest {
    C109_ConvertSortedList2BST c109_convertSortedList2BST = new C109_ConvertSortedList2BST();
    @Test
    public void testSortedListToBST() throws Exception {
        ListNode head = new ListNode(3);
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(8);
        head.next = l1;
        l1.next = l2;
        TreeNode root = c109_convertSortedList2BST.sortedListToBST(head);
    }
}