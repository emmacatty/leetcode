package com.leetcode.P10;

import com.leetcode.P29.C297_SerializeAndDeserializeBT;
import com.leetcode.common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-16
 */
public class C106_ConstructBTfromInPostorderTest {
    C106_ConstructBTfromInPostorder c106_constructBTfromInPostorder = new C106_ConstructBTfromInPostorder();
    C297_SerializeAndDeserializeBT c297_serializeAndDeserializeBT = new C297_SerializeAndDeserializeBT();
    @Test
    public void testBuildTree() throws Exception {
        int[] inorder = {4,2,5,1,3};
        int[] postorder = {4,5,2,3,1};
        TreeNode root = c106_constructBTfromInPostorder.buildTree(inorder, postorder);
        System.out.println(c297_serializeAndDeserializeBT.serialize(root));
    }
}