package sorting.소트;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int S = Integer.parseInt(br.readLine());

        for (int i = 0; i < N && S > 0; i++) {
            int maxIdx = i;

            for (int j = i + 1; j < N && j <= i + S; j++) {
                if (A[maxIdx] < A[j]) {
                    maxIdx = j;
                }
            }

            if (maxIdx == i) {
                continue;
            }

            for (int idx = maxIdx; idx > i; idx--) {
                int temp = A[idx];
                A[idx] = A[idx - 1];
                A[idx - 1] = temp;
            }

            S -= maxIdx - i;
        }

        for (int a : A) {
            bw.write(a + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
