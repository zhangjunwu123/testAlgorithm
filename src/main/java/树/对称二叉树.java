package 树;
/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * 示例 1：
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 * 示例 2：
 * 输入：root = [1,2,2,null,3,null,3]
 * 输出：false
 * */
public class 对称二叉树 {

    public boolean checkSymmetric(TreeNode root){


        return check(root, root);
    }
    /**
     * 使用两个root，左右指针比较
     * */
    static boolean check(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return check(p.left, q.right) && check(p.right, q.left);
    }

}
