package com.leetcode.P34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2016-05-28
 */
public class C347_TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nums2freq = new HashMap<Integer, Integer>();
        for (int i : nums) {
            int freq = 1;
            if (nums2freq.containsKey(i)) {
                freq = nums2freq.get(i) + 1;
            }
            nums2freq.put(i, freq);
        }

        List<Integer>[] frequency = new ArrayList[nums.length + 1];
        for (int i : nums2freq.keySet()) {
            int freq = nums2freq.get(i);
            if (frequency[freq] == null) {
                frequency[freq] = new ArrayList<Integer>();
            }
            frequency[freq].add(i);
        }

        List<Integer> res = new ArrayList<Integer>();
        int i = nums.length;
        while (k > 0 && i > 0) {
            if (frequency[i] != null && frequency[i].size() != 0) {
                for (int j = 0; j < frequency[i].size(); j++) {
                    res.add(frequency[i].get(j));
                    k--;
                }
            }
            i--;
        }
        return res;
    }

}
