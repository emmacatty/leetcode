package com.leetcode.P10;

import com.leetcode.common.TreeNode;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-16
 */
public class C106_ConstructBTfromInPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         if (inorder.length != postorder.length || inorder.length == 0) {
             return null;
         }
        return buildTreeCore(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    private TreeNode buildTreeCore(int[] inorder, int istart, int iend, int[] postorder, int pstart, int pend) {
        if (istart > iend) {
            return null;
        }
        int rootVal = postorder[pend];
        TreeNode root = new TreeNode(rootVal);
        int count = 0;
        for (int i = istart; i <= iend; i++, count++) {
            if (inorder[i] == rootVal) {
                break;
            }
        }
        root.left = buildTreeCore(inorder, istart, istart + count - 1, postorder, pstart, pstart + count -1);
        root.right = buildTreeCore(inorder, istart + count + 1, iend, postorder, pstart + count, pend-1);
        return root;
    }
}
