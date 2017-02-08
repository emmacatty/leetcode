package com.leetcode.P10;

import com.leetcode.common.ListNode;
import com.leetcode.common.TreeNode;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-07
 */
public class C109_ConvertSortedList2BST {
    private ListNode next;
    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        next = head;
        return sortedListToBSTCore(0, len-1);
    }

    private TreeNode sortedListToBSTCore(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode left = sortedListToBSTCore(start, mid-1);
        TreeNode root = new TreeNode(next.val);
        root.left = left;
        next = next.next;
        TreeNode right = sortedListToBSTCore(mid+1, end);
        root.right = right;
        return root;
    }

}
