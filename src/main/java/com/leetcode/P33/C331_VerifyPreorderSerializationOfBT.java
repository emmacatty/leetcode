package com.leetcode.P33;

import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-21
 */
public class C331_VerifyPreorderSerializationOfBT {
    public boolean isValidSerialization(String preorder) {
        if (preorder == null || preorder.length() == 0) {
            return true;
        }
        String[] orders = preorder.split(",");
        Stack<String> stk = new Stack<String>();
        for (String node : orders) {
            if (node.equals("#")) {
                while (stk.size() > 1 && stk.peek().equals("#") && !stk.get(stk.size() - 2).equals("#")) {
                    stk.pop();
                    stk.pop();
                }
            }
            stk.push(node);
        }
        return stk.size() == 1 && stk.peek().equals("#");
    }

    public boolean bestIsValidSerializatino(String preorder) {
        String[] strs = preorder.split(",");
        // root has no indegree ,for compensate init with -1
        int degree = -1;
        for (String str : strs) {
            // all nodes have 1 indegree;
            degree++;
            // total degree should never exceeds 0
            if (degree > 0) {
                return false;
            }
            // only non-leaf node has 2 outdegree
            if (!str.equals("#")) {
                degree -= 2;
            }
        }
        return degree == 0;
    }
}
