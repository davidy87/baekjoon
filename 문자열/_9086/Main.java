package 문자열._9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] words = new String[T];

        for (int i = 0; i < T; i++) {
            words[i] = br.readLine();
        }

        br.close();

        for (int i = 0; i < T; i++) {
            String word = words[i];
            System.out.println("" + word.charAt(0) + word.charAt(word.length() - 1));
        }
    }
}
