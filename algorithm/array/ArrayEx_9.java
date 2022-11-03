package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_9 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int dia1=0, dia2=0;

        // 가로, 세로
        for (int i=0; i<n; i++) {
            int row=0, col=0;
            for (int j=0; j<n; j++) {
                row += arr[i][j];  // 각 행의 합
                col += arr[j][i];  // 각 열의 합
            }

            // 대각
            dia1 += arr[i][i];
            dia2 += arr[i][n-i-1];

            // 더 큰 값을 answer에 저장
            answer = Math.max(answer, row);
            answer = Math.max(answer, col);
            answer = Math.max(answer, dia1);
            answer = Math.max(answer, dia2);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_9 T = new ArrayEx_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] numArr = new int[N][N];
        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; st.hasMoreTokens(); j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(T.solution(N, numArr));


    }
}
