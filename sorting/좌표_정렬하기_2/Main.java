package sorting.좌표_정렬하기_2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] coordinates = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coordinates, (c1, c2) ->
                c1[1] == c2[1] ? Integer.compare(c1[0], c2[0]) : Integer.compare(c1[1], c2[1]));

        for (int[] c : coordinates) {
            bw.write(c[0] + " " + c[1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
