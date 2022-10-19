package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrayEx_2 {
    public int solution(int[] numArr) {
        int answer = 1;
        int target = numArr[0];  // 앞 사람들 중 가장 큰 키
        for (int i=1; i< numArr.length; i++) {
            // 앞 사람들보다 키가 크면 ++
            if (numArr[i] > target) {
                answer++;
                target = numArr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_2 T = new ArrayEx_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numArr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(T.solution(numArr));
    }
}

/**
 * 무난하게 풀 수 있던 문제였다.
 */