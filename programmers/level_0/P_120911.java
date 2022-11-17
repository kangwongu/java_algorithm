import java.util.Arrays;

/**
 * 나의 풀이
 * 소문자 변환하고 char배열로 변환 해 정렬해서 해결
 */
class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);

        answer = String.valueOf(chars);

        return answer;
    }
}