import java.util.Arrays;

/**
 * 배열 정렬 후, 가장 앞쪽 2개 요소 곱과 가장 뒤쪽 2개 요소 곱 중 최대값을 구했다.
 * 음수는 앞쪽으로 정렬될텐데, 음수끼리 곱을 하면 양수가 되기 때문에 이를 고려한 것!
 */
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = Math.max((numbers[0]*numbers[1]), (numbers[numbers.length-2]*numbers[numbers.length-1]));
        return answer;
    }
}