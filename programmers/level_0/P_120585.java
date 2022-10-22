import java.util.Arrays;

/**
 * 다른 사람 풀이
 * stream을 활용해서 문제를 풀었다.
 * stream을 활용하면 확실히 코드 수도 줄어들고, 간편하게 작성할 수 있는 것 같다.
 * 배워봐야 하는디
 */
class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}

/**
 * 나의 풀이
 */
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) answer++;
        }
        return answer;
    }
}



