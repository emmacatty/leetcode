package com.leetcode.P23;

import com.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-06-08
 */
public class C230_KthSmallestEleInBSTTest {

    @Test
    public void testKthSmallest() throws Exception {
        C230_KthSmallestEleInBST example = new C230_KthSmallestEleInBST();
        TreeNode root = new TreeNode(6);
        TreeNode t4 = new TreeNode(4);
        TreeNode t8 = new TreeNode(8);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t7 = new TreeNode(7);
        TreeNode t9 = new TreeNode(9);
        TreeNode t1 = new TreeNode(1);
        root.left = t3;
        root.right = t8;
        t3.left = t2;
        t3.right = t4;
        t2.left = t1;
        t8.left = t7;
        t8.right = t9;
        example.traverseTree(root, 2);
//        assertEquals(9, example.kthSmallest(root, 8));

//        t3.left = t1;
//        t1.right = t2;
//        t3.right = t4;
//        assertEquals(4, example.kthSmallest(t3, 4));

    }
}