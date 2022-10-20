package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx_4 {
    public int[] solution(int N) {
        int[] answer = new int[N];
        // 처음과 그 다음값은 미리 할당
        answer[0] = 1;
        answer[1] = 1;

        for (int i=2; i<N; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    // 배열 사용않고 리턴값없이 바로 출력하는 방법
//    public void solution2(int N) {
//        int a=1, b=1, c;
//        System.out.print(a + " " + b + " ");
//        for (int i=2; i<N; i++) {
//            c = a+b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
//    }

    public static void main(String[] args) throws IOException {
        ArrayEx_4 T = new ArrayEx_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int num : T.solution(N)) {
            System.out.print(num + " ");
        }
//        System.out.println();
//        T.solution2(N);
    }
}

/**
 * 무난하게 풀 수 있던 문제
 * 배열에 값을 저장하고 반환할 수도 있고, 반환없이 바로 출력할 수도 있었다.
 * 내 실력이 좋아진건지
 * 아님 문제가 쉬운건지..
 * 전자 였으면 좋겠다..
 * 호호
 */