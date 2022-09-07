package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1546 {
    public static void main(String[] args) {
        // 점수 중 최대값 구하기
        // 구한 최대값으로 모든 점수를 각각 최대값으로 나누고 *100
        // 새로운 평균 구하기
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] scores = new double[N];
        double max = 0;
        double sum = 0;
        double aver = 0;

        // 값 입력
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextDouble();
        }

        // 최대값 찾기
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }

        // 점수 조정
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i]/max*100;
            sum += scores[i];
        }

        // 새로운 평균 구하기
        aver = sum/ scores.length;
        System.out.println(aver);
    }
}
