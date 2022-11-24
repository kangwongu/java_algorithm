package algorithm.twopointers;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TwoPointersEx_1 {
    public ArrayList<Integer> solution(int n, int m, int[] array1, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int pos1=0, pos2=0;

        // array1, array2 중 한 쪽이라도 배열의 크기 범위를 넘으면 종료
        // 종료 안하면 ArrayIndexOutOfBoundsException 문제 발생
        while (pos1<n && pos2<m) {
            if (array1[pos1] > array2[pos2]) {
                answer.add(array2[pos2]);
                pos2++;
            } else if (array1[pos1] < array2[pos2]) {
                answer.add(array1[pos1]);
                pos1++;
            } else {
                answer.add(array1[pos1]);
                answer.add(array2[pos2]);
                pos1++;
                pos2++;
            }
        }

        // array1의 원소가 남아있음 -> 남은 원소들 뽑아내기
        while (pos1<n) {
            answer.add(array1[pos1]);
            pos1++;
        }
        // array2의 원소가 남아있음 -> 남은 원소들 뽑아내기
        while (pos2<m) {
            answer.add(array2[pos2]);
            pos2++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        TwoPointersEx_1 T = new TwoPointersEx_1();
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