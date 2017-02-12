package com.leetcode.P20;

import com.sun.deploy.util.StringUtils;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-12
 */
public class C208_ImplementTrie {
    class TrieNode {
        private char val;
        private TrieNode[] children;
        private boolean isWord;
        public TrieNode(char val) {
            this.val = val;
            children = new TrieNode[26];
            isWord = false;
        }
    }
    private TrieNode root;
    public C208_ImplementTrie() {
        root = new TrieNode(' ');
    }
    public void insert(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char val = word.charAt(i);
            if (cur.children[val-'a'] == null) {
                TrieNode tn = new TrieNode(val);
                cur.children[val-'a'] = tn;
            }
            cur = cur.children[val-'a'];
            if (i == word.length() - 1){
                cur.isWord = true;
            }
        }
    }

    public boolean search(String word) {
        if (word == null || word.isEmpty()) {
            return true;
        }
        TrieNode cur = root;
        boolean res = false;
        for (int i = 0; i < word.length(); i++) {
            char val = word.charAt(i);
            if (cur.children[val-'a'] == null) {
                break;
            }
            if (i == word.length() -1 && cur.children[val - 'a'].isWord == true) {
                res = true;
            }
            cur = cur.children[val-'a'];
        }
        return res;
    }

    public boolean startsWith(String prefix) {
        if (prefix == null || prefix.isEmpty()) {
            return true;
        }
        TrieNode cur = root;
        boolean res = true;
        for (int i = 0; i < prefix.length(); i++) {
            char val = prefix.charAt(i);
            if (cur.children[val-'a'] == null) {
                res = false;
                break;
            }
            cur = cur.children[val-'a'];
        }
        return res;
    }
}
