package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_10 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        // 상하좌우 탐색때 쓸 배열
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean isBong = true;
                // 상하좌우 탐색
                for (int k=0; k<4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    // 봉우리가 아님
                    if (nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] > arr[i][j]) {
                        isBong = false;
                        break;
                    }
                }
                // 봉우리면 ++
                if (isBong) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_10 T = new ArrayEx_10();
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