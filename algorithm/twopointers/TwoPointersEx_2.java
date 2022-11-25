package algorithm.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointersEx_2 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pos1=0, pos2=0;
        // 배열 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        // 두 배열 중 한 배열의 순회가 끝날때 까지 반복
        while (n>pos1 && m>pos2) {
            if (a[pos1] > b[pos2]) {
                pos2++;
            } else if (b[pos2] > a[pos1]) {
                pos1++;
            // a와 b 배열의 요소가 같은 경우, answer에 넣어야 하는 경우
            } else {
                answer.add(a[pos1]);
                pos1++;
                pos2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPointersEx_2 T = new TwoPointersEx_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] array1;
        int[] array2;

        int N = Integer.parseInt(br.readLine());
        array1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        array2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; st.hasMoreTokens(); i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : T.solution(N, M, array1, array2)) {
            System.out.print(i + " ");
        }
    }
}
