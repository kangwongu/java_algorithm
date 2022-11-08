package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_11 {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        int max = 0;    // 같은 반 빈도가 가장 많은 학생

        // 배열 순회,
        for(int i=1; i<=n; i++) {
            int count = 0;
            for (int j=1; j<=n; j++) {
                for (int k=1; k<=5; k++) {  // 5학년까지 있기 때문에 상수로 지정함
                    // i번 학생과 가장 많은 빈도로 같은 반이었던 학생 수를 찾는다
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        // 특정 학생과 같은 반인 경우가 있다면 break
                        // (ex. 1,2학년때 같은 반이라고 count가 2가되면 안되니까)
                        break;
                    }
                }
            }
            if (count > max) {
                max = count;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_11 T = new ArrayEx_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] numArr = new int[N+1][6];
        for (int i=1; i<=N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=1; st.hasMoreTokens(); j++) {
                numArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(T.solution(N, numArr));
    }
}
