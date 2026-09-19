class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];

        // Avoid infinite recursion if colors are same
        if (original == color) {
            return image;
        }

        dfs(image, sr, sc, original, color);

        return image;
    }

    private void dfs(int[][] image, int r, int c,
                     int original, int color) {

        // Check boundaries and original color
        if (r < 0 || c < 0 ||
            r >= image.length || c >= image[0].length ||
            image[r][c] != original) {
            return;
        }

        // Change pixel color
        image[r][c] = color;

        // Visit 4 adjacent directions
        dfs(image, r + 1, c, original, color); // Down
        dfs(image, r - 1, c, original, color); // Up
        dfs(image, r, c + 1, original, color); // Right
        dfs(image, r, c - 1, original, color); // Left
    }
}
