package baekjoon;

import java.util.Scanner;

public class While_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int copyNum = num;
        int count = 0;

        while (true) {
            copyNum = (copyNum%10*10) + ((copyNum/10)+(copyNum%10))%10;
            count++;
            if (copyNum == num) {
                break;
            }
        }
        System.out.println(count);
    }
}
