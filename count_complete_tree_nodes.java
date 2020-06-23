
public class count_complete_tree_nodes {
    public static void main(String[] args) {
        System.out.println("Simply return 0 from null and from each level l + r + 1");
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class s {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        return l + r + 1;
    }
}