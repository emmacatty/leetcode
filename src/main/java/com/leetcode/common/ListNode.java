package com.leetcode.common;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-04-27
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) {val = x;}
    public void printList() {
        ListNode hh = next;
        System.out.println(val);
        while (hh != null) {
            System.out.println(hh.val);
            hh = hh.next;
        }
    }
}





