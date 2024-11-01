package 조건문.주사위_세개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] counter = new int[7];
        int award = 0;
        int max = 0;

        for (int n : nums) {
            counter[n]++;
        }

        for (int n : nums) {
            max = Integer.max(n, max);

            if (counter[n] == 3) {
                award = 10_000 + n * 1_000;
                break;
            } else if (counter[n] == 2) {
                award = 1_000 + n * 100;
                break;
            }
        }

        if (award == 0) {
            award = max * 100;
        }

        System.out.println(award);
    }
}
