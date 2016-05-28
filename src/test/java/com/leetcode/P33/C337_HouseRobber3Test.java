package com.leetcode.P33;

import com.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-15
 */
public class C337_HouseRobber3Test {

    @Test
    public void testRob() throws Exception {
        C337_HouseRobber3 example = new C337_HouseRobber3();
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(1);
        n1.left = n2;
        n2.right = n3;
        n3.right = n4;
        n4.right = n5;
        assertEquals(7, example.rob(n1));
    }
}