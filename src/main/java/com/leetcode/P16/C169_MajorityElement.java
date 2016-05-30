package com.leetcode.P16;

import java.util.Stack;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-28
 */
public class C169_MajorityElement {
    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i : nums) {
            if (stack.isEmpty()) {
                stack.push(i);
            } else {
                if (i == stack.peek()) {
                    stack.push(i);
                } else {
                    stack.pop();
                }
            }
        }
        return stack.peek();
    }
}
