package baekjoon;

import java.util.Scanner;

public class If_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute < 45) {
            hour--;
            minute += 15;
            if (hour < 0) {
                hour = 23;
            }
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}
