package 문자열._10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final int N = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] results = new int[N];
        Arrays.fill(results, -1);

        for (int i = 0; i < S.length(); i++) {
            int charPos = S.charAt(i) - 'a';
            if (results[charPos] == -1) {
                results[charPos] = i;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(results[i] + " ");
        }
    }
}
