import java.util.*;

public class Codec {

    // Serialize the tree into a string
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("#,");
            return;
        }

        sb.append(root.val).append(',');

        buildString(root.left, sb);
        buildString(root.right, sb);
    }

    // Deserialize the string into a tree
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        int[] index = {0};

        return buildTree(nodes, index);
    }

    private TreeNode buildTree(String[] nodes, int[] index) {
        String value = nodes[index[0]++];

        if (value.equals("#")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(value));

        root.left = buildTree(nodes, index);
        root.right = buildTree(nodes, index);

        return root;
    }
}
