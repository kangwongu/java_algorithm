import java.util.Arrays;

/**
 * 나의 풀이
 * 배열을 우선 정렬 후, 가장 끝과, 끝 앞에 있는 원소들을 곱해주었다.
 * (정렬하면 가장 큰 수는 가장 맨뒤에 있으니깐)
 */
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int len = numbers.length-1;
        answer = numbers[len] * numbers[len-1];
        return answer;
    }
}