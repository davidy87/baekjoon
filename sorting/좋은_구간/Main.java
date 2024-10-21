package sorting.좋은_구간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int[] S = new int[L + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= L; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(S);

        int n = Integer.parseInt(br.readLine());
        int[] range = new int[2];

        for (int i = 1; i <= L; i++) {
            if (S[i] == n) {
                System.out.println(0);
                return;
            }

            if (S[i] > n) {
                range[0] = S[i - 1] + 1;
                range[1] = S[i] - 1;
                break;
            }
        }

        range[0] = n - range[0];
        range[1] = range[1] - n;

        System.out.println(range[0] + range[1] + range[0] * range[1]);
    }
}
