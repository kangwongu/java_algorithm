package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_10 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        // 특정 인덱스의 상 우 하 좌를 탐색하기 위해 필요한 위치값
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                boolean isBong = true;
                // 각 요소의 상하좌우 인덱스와 크기 비교해서 봉우리 여부를 판단해야 한다
                for (int k=0; k<4; k++) {
                    int searchX = i+dx[k];
                    int searchY = j+dy[k];

                    // 특정 인덱스가 상하좌우보다 작다면 봉우리가 아님
                    if (searchX>=0 && searchX<n && searchY>=0 && searchY<n && arr[i][j] <= arr[searchX][searchY]) {
                        isBong = false;
                        break;
                    }
                }
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