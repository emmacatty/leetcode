package com.leetcode.P50;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * Created: wwxu(xuwenwen@xiaomi.com)
 * Date: 2017-02-20
 */
public class C513_FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        List<TreeNode> qu = new ArrayList<TreeNode>();
        qu.add(root);
        int bottomLeftVal = 0;
        while (!qu.isEmpty()) {
            int size = qu.size();
            bottomLeftVal = qu.get(0).val;
            for (int i = 0; i < size; i++) {
                TreeNode cur = qu.get(0);
                if (cur.left != null) {
                    qu.add(cur.left);
                }
                if (cur.right != null) {
                    qu.add(cur.right);
                }
                qu.remove(0);
            }
        }
        return bottomLeftVal;
    }

}
