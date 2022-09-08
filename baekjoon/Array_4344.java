package baekjoon;

import java.util.Scanner;

public class Array_4344 {
    public static void main(String[] args) {
        // 1. 테스트케이스 개수
        // 2. 학생의 수, 학생의 수만큼 과목 점수 입력
        // 3. 평균을 넘는 학생 수 구하기
        // 4. 평균 넘는 학생의 비율 구하기
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int[] scoreList;
        double average = 0;

        // 테스트케이만큼 반복
        for (int i = 0; i < C; i++) {
            scoreList = new int[scanner.nextInt()];
            int sum = 0;
            // 학생 수만큼 과목 점수 입력
            for (int j = 0; j < scoreList.length; j++) {
                scoreList[j] = scanner.nextInt();
                sum += scoreList[j];
            }

            // 평균 구하기
            average = (double) sum / scoreList.length;

            // 평균 넘는 사람 수
            int count = 0;
            for (int k = 0; k < scoreList.length; k++) {
                // 평균 넘으면 count++
                if (scoreList[k] > average) {
                    count++;
                }
            }

            double ratio = (double) count / scoreList.length * 100;
            System.out.printf("%.3f%%\n", ratio);
        }
    }
}