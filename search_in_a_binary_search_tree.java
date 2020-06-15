
public class search_in_a_binary_search_tree {
    public static void main(String[] args) {
        System.out.println("Simple bst search go to left if node val larger else go to right and if equal return node if null return null");
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
class Su {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }
    private TreeNode search(TreeNode node, int val){
        if(node == null){
            return null;
        }
        if(node.val == val){
            return node;
        }
        TreeNode ans = null;
        if(node.val < val){
            TreeNode right = search(node.right, val);
            ans = (right == null ? ans : right);
        }else if(node.val > val){
            TreeNode left = search(node.left, val);
            ans = (left == null ? ans : left);
        }
        return ans;
    }
}