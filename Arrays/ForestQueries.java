package Arrays;
import java.io.*;
import java.util.*;

public class ForestQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        while (inputLine == null || inputLine.trim().isEmpty()) {
            inputLine = br.readLine(); // keep reading until we get a valid line
        }

        StringTokenizer st = new StringTokenizer(inputLine);
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] prefix = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String row = br.readLine();
            while (row == null || row.trim().isEmpty()) {
                row = br.readLine();
            }

            for (int j = 1; j <= n; j++) {
                int tree = (row.charAt(j - 1) == '*') ? 1 : 0;
                prefix[i][j] = tree + prefix[i - 1][j] + prefix[i][j - 1] - prefix[i - 1][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            inputLine = br.readLine();
            while (inputLine == null || inputLine.trim().isEmpty()) {
                inputLine = br.readLine();
            }

            st = new StringTokenizer(inputLine);
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            int ans = prefix[y2][x2] - prefix[y1 - 1][x2] - prefix[y2][x1 - 1] + prefix[y1 - 1][x1 - 1];
            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}
