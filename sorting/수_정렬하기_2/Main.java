package sorting.수_정렬하기_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        List<Integer> nums = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(bf.readLine()));
        }

        Collections.sort(nums);

        for (int num : nums) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
    }
}
