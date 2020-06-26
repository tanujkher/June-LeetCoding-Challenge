
public class sum_root_to_leaf_numbers {
    public static void main(String[] args) {
        System.out.println("Simple recursive solution take a string to the end of each node add current digit to it at end parse it to integer and return");
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
class ut {
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        return getSum(root, "");
    }
    private int getSum(TreeNode node, String curr){
        if(node.left == null && node.right == null){
            curr = curr + node.val;
            return curr.equals("") ? 0 : Integer.parseInt(curr);
        }
        int sum = 0;
        if(node.left != null){
            sum = sum + getSum(node.left, curr + node.val);
        }
        if(node.right != null){
            sum = sum + getSum(node.right, curr + node.val);
        }
        return sum;
    }
}