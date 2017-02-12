package com.leetcode.P20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-12
 */
public class C208_ImplementTrieTest {
    C208_ImplementTrie c208_implementTrie = new C208_ImplementTrie();

    @Test
    public void testInsert() throws Exception {
        c208_implementTrie.insert("emma");
        assertTrue(c208_implementTrie.search("emma"));
        assertTrue(c208_implementTrie.startsWith("em"));
        c208_implementTrie.insert("emm");
        assertTrue(c208_implementTrie.search("emm"));
    }
}