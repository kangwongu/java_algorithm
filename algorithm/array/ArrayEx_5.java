package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx_5 {
    /**
     * 나의 풀이 (오답)
     * 2,3은 소수니까 answer에 담고, 4부터 순회해서 소수면 answer++
     * 답과 같은 값은 나오는데 틀림
     */
//    public int solution(int n) {
//        int answer = 2;
//        int[] arr = new int[n+1];
//        for (int i=4; i<arr.length; i++) {
//            // 소수면 ++
//            if (i%2!=0 && i%3!=0) {
//                arr[i]++;
//            }
//            if (arr[i] == 1) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i=2; i<=n; i++) {
            // 소수면 ++
            if (arr[i] == 0) {
                answer++;
                // i의 배수를 1로 체크 -> 소수가 아니라는 의미
                // ex) i=2 -> 4,6,8... 1로 변경 -> 소수가 아니라는 의미
                for (int j=i; j<=n; j=j+i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_5 T = new ArrayEx_5();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(T.solution(N));
    }
}
/**
 * 어려웠다..
 * 어려웠던 만큼 이렇게도 풀 수 있구나~하며 좀 더 넓은 시각을 가질 수 있는 경험이 되었다고 믿겠다ㅎ
 */