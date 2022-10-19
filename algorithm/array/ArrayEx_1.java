package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayEx_1 {
//    public String solution(int[] numArr) {
//        String answer = "";
//        // 처음값 무조건 출력
//        answer += numArr[0] + " ";
//        // 비교해가며 탐색
//        for (int i=0; i<numArr.length-1; i++) {
//            if(numArr[i] < numArr[i+1]) {
//                answer += numArr[i+1] + " ";
//            }
//        }
//
//        return answer;
//    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 처음값 무조건 넣기
        answer.add(arr[0]);

        for (int i=1; i<n; i++) {
            if (arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_1 T = new ArrayEx_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int numArr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
//        System.out.println(T.solution(numArr));
        for (int num : T.solution(N, numArr)) {
            System.out.print(num + " ");
        }
    }
}

/**
 * 간단한 문제지만, 나는 어렵게 푼 거 같다..
 * 나는 반환값을 String으로 해서 억지로 공백을 줘가며 출력했는데,
 * 그냥 ArrayList에 담고, 출력할 때만 공백을 주면 됐었다.
 * 배열로 반환해야 한다는 생각때문에 그냥 String에 담았는데, ArrayList로 담으면 됐었다.
 */