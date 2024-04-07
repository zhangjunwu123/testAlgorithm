package 树;
/**
 * 给定一个二叉树 root ，返回其最大深度。
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 * 示例 1：
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：3
 * 示例 2：
 * 输入：root = [1,null,2]
 * 输出：2
 * */
public class 二叉树的最大深度 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left1 = new TreeNode(9);
        TreeNode right1 = new TreeNode(20);
        TreeNode left2 = new TreeNode(15);
        TreeNode right2 = new TreeNode(7);
        root.left = left1;
        root.right = right1;
        right1.left = left2;
        right1.right = right2;
        System.out.println(maxDepth(root));

    }
    /**
     * 深度优先遍历
     * 树的深度 = max（左子树的深度，右子树的深度） + 1
     * */

    static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight)+1;
        }

    }

}
