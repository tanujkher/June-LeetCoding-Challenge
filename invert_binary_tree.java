import java.util.Stack;
//  Definition for a binary tree node.
public class invert_binary_tree{
    public static void main(String[] args) {
        System.out.println("Iterative and Recursive solution");
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        // invertRecursive(root);
        invertIterative(root);
        return root;
    }
    private void invertIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cp = st.pop();
            if(cp.left != null){
                st.push(cp.left);
            }
            if(cp.right != null){
                st.push(cp.right);
            }
            TreeNode temp = cp.left;
            cp.left = cp.right;
            cp.right = temp;
        }
    }
    private void invertRecursive(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertRecursive(node.left);
        invertRecursive(node.right);
    }
}