import java.util.Arrays;

/**
 * 나의 풀이
 * Arrays.copyOfRange() 메소드로 배열을 자를 수 있다.
 */
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
}