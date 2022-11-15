import java.util.Arrays;

/**
 * 배열을 우선 정렬 후,
 * 가운데 인덱스 값을 출력하면 중위값을 출력할 수 있었다
 */
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length/2];
        return answer;
    }
}