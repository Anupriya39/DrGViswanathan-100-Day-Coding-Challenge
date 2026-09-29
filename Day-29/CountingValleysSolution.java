import java.io.*;
import java.util.*;

public class Solution {

    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valleys = 0;

        for (char step : path.toCharArray()) {

            if (step == 'U') {
                level++;

                // If we come back to sea level,
                // we have just completed a valley.
                if (level == 0) {
                    valleys++;
                }
            } else {
                level--;
            }
        }

        return valleys;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(br.readLine().trim());
        String path = br.readLine().trim();

        int result = countingValleys(steps, path);

        System.out.println(result);
    }
}
