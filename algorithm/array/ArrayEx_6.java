package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayEx_6 {
    /**
     * 내가 푼 풀이
     * 일단 완성도 못했다.
     * 숫자 뒤집는 건 코드중복이 있지만 어찌어찌 했는데, 소수를 어떻게 판별할지에서 막혔다
     */
//    public ArrayList<Integer> solution(int n, int[] arr) {
//        ArrayList<Integer> answer = new ArrayList<>();
//        for (int i=0; i<arr.length; i++) {
//            // 숫자 뒤집기
//            if (arr[i] > 100) {
//                arr[i] = ((arr[i]%10)*10+(arr[i]/10));
//                arr[i] = ((arr[i]%10)*10+(arr[i]/10));
//            } else {
//                arr[i] = ((arr[i]%10)*10+(arr[i]/10));
//            }
//        }
//
//        int[] sosuArr = new int[arr.length];
//        // 소수 구하기
//        for (int i=2; i<arr.length; i++) {
//            if (arr[i] == 0)
//        }
//
//        return answer;
//    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // 숫자 뒤집기
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            // 소수인지 확인
            if (isPrime(res)) {
                answer.add(res);
            }
        }
        return answer;
    }

    // 소수를 판별하는 메소드
    public boolean isPrime(int num) {
        if(num==1) return false;
        for (int i=2; i<num; i++) {
            // 약수가 존재하면? -> 소수가 아님
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_6 T = new ArrayEx_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        for (int num : T.solution(N, numArr)) {
            System.out.print(num + " ");
        }
    }
}

/**
 * 아예 소수를 판별하는 메소드를 두고, 뒤집은 수를 인자로 넘겨줘 소수 여부를 체크하고 소수면 answer에 담아서 해결할 수 있었다.
 * 수를 뒤집는 거도, 중복을 피하는 좋은 방법이 있었다.
 * 엉망이었지만, 이렇게 방법을 하나씩 알아간다고 생각할래
 */