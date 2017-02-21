package com.leetcode.P31;

import javafx.util.Pair;
import javafx.util.converter.IntegerStringConverter;

import java.util.*;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-16
 */
public class C310_MinHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        int[] degreeTable = buildDegreeTable(n, edges);
        while (n > 2) {
            List<Integer> leafs = new ArrayList<Integer>();
            for (int i = 0; i < degreeTable.length; i++) {
                if (degreeTable[i] == 1) {
                    leafs.add(i);
                }
            }
            n -= leafs.size();
            for (int l : leafs) {
                for (int i = 0; i < edges.length; i++) {
                    if (edges[i][0] == l) {
                        degreeTable[edges[i][1]] -= 1;
                    } else if (edges[i][1] == l) {
                        degreeTable[edges[i][0]] -= 1;
                    }
                }
            }
        }
        return null;
    }

    private int[] buildDegreeTable(int n, int[][] edges) {
        int[] degreeTable = new int[n];
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                degreeTable[edges[i][j]] += 1;
            }
        }
        return degreeTable;
    }


}
