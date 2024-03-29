/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode_101 {
}


class Solution {//通过递归，进行镜像对比。即将该树创立两次，然后分别用A树的左子树比较B树的右子树，用A树的右子树比较B树的左子树
    public boolean isSymmetric(TreeNode root) {
        return Compare(root,root);
    }

    public boolean Compare(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null)return true;
        if (t1 == null || t2 == null) return false;
        return((t1.val == t2.val) && Compare(t1.left,t2.right) && Compare(t1.right,t2.left));
    }

}