class Solution {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        // Flatten left and right subtrees first
        flatten(root.left);
        flatten(root.right);

        // Save the already-flattened right subtree
        TreeNode rightSubtree = root.right;

        // Move left subtree to the right
        root.right = root.left;
        root.left = null;

        // Find the end of the new right subtree
        TreeNode current = root;

        while (current.right != null) {
            current = current.right;
        }

        // Attach original right subtree
        current.right = rightSubtree;
    }
}
