package 심화_1._3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int[] PIECES = {1, 1, 2, 2, 2, 8};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();

        for (int i = 0; i < n; i++) {
            System.out.print(PIECES[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
}
