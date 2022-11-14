package programmers.level_0;

import java.util.Arrays;

/**
 * 처음엔 Character의 isDigit메소드를 활용해 숫자여부를 판단하며 문제를 풀려했지만 실패!
 * replaceAll을 활용해 숫자 이외의 문자들을 지우고 문제를 풀었다
 */
class Solution {
    public int[] solution(String my_string) {
        int[] answer;
        my_string = my_string.replaceAll("[^0-9]", "");
        System.out.println(my_string);
        answer = new int[my_string.length()];

        for (int i=0; i<answer.length; i++) {
            answer[i] = Integer.parseInt(String.valueOf(my_string.charAt(i)));
        }

        Arrays.sort(answer);
        return answer;
    }
}