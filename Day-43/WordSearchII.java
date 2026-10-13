import java.util.*;

class Solution {
    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    private final int[][] directions = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    private TrieNode root;
    private List<String> result;
    private int rows, cols;

    public List<String> findWords(char[][] board, String[] words) {
        root = new TrieNode();
        result = new ArrayList<>();
        rows = board.length;
        cols = board[0].length;

        // Build the Trie
        for (String word : words) {
            TrieNode node = root;

            for (char c : word.toCharArray()) {
                int index = c - 'a';

                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }

                node = node.children[index];
            }

            node.word = word;
        }

        // Search the board
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                dfs(board, r, c, root);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int r, int c, TrieNode node) {
        char ch = board[r][c];

        if (ch == '#' || node.children[ch - 'a'] == null) {
            return;
        }

        node = node.children[ch - 'a'];

        // A complete word has been found
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // Avoid duplicate results
        }

        // Mark the cell as visited
        board[r][c] = '#';

        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];

            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                dfs(board, nr, nc, node);
            }
        }

        // Restore the cell
        board[r][c] = ch;
    }
}
