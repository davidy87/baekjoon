package sorting.나이순_정렬;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] members = new String[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i][0] = st.nextToken();
            members[i][1] = st.nextToken();
        }

        Arrays.sort(members, Comparator.comparing(m -> Integer.parseInt(m[0])));

        for (String[] m : members) {
            bw.write(String.join(" ", m));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
