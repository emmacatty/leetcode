package com.leetcode.P9;

import com.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-15
 */
public class C99_RecoverBSTTest {
    C99_RecoverBST c99_recoverBST = new C99_RecoverBST();
    @Test
    public void testRecoverTree() throws Exception {
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1);
        TreeNode n4 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
//        n3.left = n5;
//        n3.right = n1;
//        n1.left = n4;
//        n1.right = n6;
//        System.out.print(n3.left.val);
//        System.out.print(n3.right.val);
//        System.out.print(n3.right.left.val);
//        System.out.print(n3.right.right.val);
//        c99_recoverBST.recoverTree(n3);
//        System.out.print(n3.left.val);
//        System.out.print(n3.right.val);
//        System.out.print(n3.right.left.val);
//        System.out.print(n3.right.right.val);
        TreeNode n0 = new TreeNode(0);
        n0.left = n1;
        c99_recoverBST.recoverTree(n0);
    }
}