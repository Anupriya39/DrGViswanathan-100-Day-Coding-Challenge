import java.util.*;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        Queue<int[]> pQueue = new ArrayDeque<>();
        Queue<int[]> aQueue = new ArrayDeque<>();

        // Pacific: top row + left column
        for (int i = 0; i < m; i++) {
            pacific[i][0] = true;
            pQueue.offer(new int[]{i, 0});
        }

        for (int j = 0; j < n; j++) {
            pacific[0][j] = true;
            pQueue.offer(new int[]{0, j});
        }

        // Atlantic: bottom row + right column
        for (int i = 0; i < m; i++) {
            atlantic[i][n - 1] = true;
            aQueue.offer(new int[]{i, n - 1});
        }

        for (int j = 0; j < n; j++) {
            atlantic[m - 1][j] = true;
            aQueue.offer(new int[]{m - 1, j});
        }

        // Reverse flow from each ocean
        bfs(heights, pacific, pQueue);
        bfs(heights, atlantic, aQueue);

        List<List<Integer>> ans = new ArrayList<>();

        // Cell must be reachable from both oceans
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void bfs(int[][] heights, boolean[][] visited, Queue<int[]> queue) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int r = cell[0];
            int c = cell[1];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    continue;
                }

                if (visited[nr][nc]) {
                    continue;
                }

                /*
                 * Reverse the water-flow direction.
                 * From current cell, we can move to a neighbor
                 * whose height is >= current height.
                 */
                if (heights[nr][nc] >= heights[r][c]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
}
