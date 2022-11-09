package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_12 {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_12 T = new ArrayEx_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] numArr = new int[M][N];
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; st.hasMoreTokens(); j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(T.solution(N, M, numArr));
    }


}
