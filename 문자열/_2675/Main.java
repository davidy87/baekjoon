package 문자열._2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] results = new String[T];

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            StringBuilder sb = new StringBuilder();

            for (char c : S.toCharArray()) {
                sb.append(String.valueOf(c).repeat(Math.max(0, R)));
            }

            results[t] = sb.toString();
        }

        for (String result : results) {
            System.out.println(result);
        }
    }
}
