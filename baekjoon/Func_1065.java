package baekjoon;

import java.util.Scanner;

public class Func_1065 {
    // 1 ~ 인자로 넘어오는 수 범위로 한수를 카운트한다
    public static int countHansu(int num) {
        int count = 0;

        for(int i=1; i<=num; i++) {
            if (i < 100) {
                count++;
            } else if ((i/100)-(i%100/10)==(i%100/10)-(i%10)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = countHansu(scanner.nextInt());
        System.out.println(result);

    }
}
