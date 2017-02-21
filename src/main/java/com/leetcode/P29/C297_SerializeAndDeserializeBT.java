package com.leetcode.P29;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-15
 */
public class C297_SerializeAndDeserializeBT {

    public String serialize(TreeNode root) {
        String res =  "";
        if (root == null) {
            return "";
        }
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        while (!qu.isEmpty()) {
            TreeNode cur = qu.get(0);
            qu.remove(0);
            if (cur == null) {
                res += "null,";
            } else {
                res += cur.val + ",";
                qu.add(cur.left);
                qu.add(cur.right);
            }
        }
        return res.substring(0, res.length()-1);
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) {
            return null;
        }
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        for (int i = 1; i < arr.length; i++) {
            TreeNode cur = qu.get(0);
            String leftVal = arr[i++];
            String rightVal = i == arr.length ? "null" : arr[i];
            if (!leftVal.equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(leftVal));
                cur.left = left;
                qu.add(left);
            }
            if (!rightVal.equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(rightVal));
                cur.right = right;
                qu.add(right);
            }
            qu.remove(0);
        }
        return root;
    }
}
