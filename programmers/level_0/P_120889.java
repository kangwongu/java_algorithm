import java.util.Arrays;

/**
 * 다른 사람 풀이
 * Arrays.sort()함수로 배열을 정렬해서 쉽게 풀 수 있었다.
 */
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        int isValid = sides[2] - (sides[1]+sides[0]);

        if(isValid < 0) answer = 1;
        else answer = 2;

        return answer;
    }
}

/**
 * 나의 풀이
 * 가장 긴 변과, 다른 두 변의 길이 합을 구하고 삼각형이 가능한지 여부를 체크했다.
 */
class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max = 0;
        int index = 0;
        int hab = 0;
        // 가장 긴 변
        for (int i=0; i<sides.length; i++) {
            if (sides[i] > max) {
                max = sides[i];
                index = i;
            }
        }
        // 다른 두 변의 길이 합
        for (int i=0; i<sides.length; i++) {
            // 가장 긴 변 인덱스x
            if (i != index) {
                hab += sides[i];
            }
        }
        if (hab > max) answer = 1;

        return answer;
    }
}