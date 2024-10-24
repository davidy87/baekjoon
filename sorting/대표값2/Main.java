package sorting.대표값2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final int N = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[N];

        for (int i = 0 ; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        System.out.println(total / nums.length);
        System.out.println(nums[N / 2]);
        br.close();
    }
}
