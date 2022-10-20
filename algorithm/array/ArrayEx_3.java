package algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayEx_3 {
    public ArrayList<String> solution(int N, int[] A, int[] B) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i=0; i<N; i++) {
            // A가 이기면
            if ((A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2) ||
                (A[i] == 1 && B[i] == 3)) {
                answer.add("A");
            }
            // B가 이기면
            else if ((A[i] == 1 && B[i] == 2) || (A[i] == 2 && B[i] == 3) ||
                    (A[i] == 3 && B[i] == 1)) {
                answer.add("B");
            }
            // 비기면
            else {
                answer.add("D");
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        ArrayEx_3 T = new ArrayEx_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        // A 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        // B 입력
        st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        for (String s : T.solution(N, A, B)) {
            System.out.println(s);
        }
    }
}
