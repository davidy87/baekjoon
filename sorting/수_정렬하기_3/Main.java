package sorting.수_정렬하기_3;

import java.io.*;

/**
 * Counting sort
 */
public class Main {

    private static final int MAX = 10_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] count = new int[MAX + 1];
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= MAX; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
