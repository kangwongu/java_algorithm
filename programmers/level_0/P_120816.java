/**
 * 나의 풀이
 * 생각보다 어려워서 시간을 많이 잡아먹었다
 * 무한루프를 활용해 조건을 만족하면 break하는 방식으로 구현했다.
 */
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int target = slice;
        while (true) {
            answer++;
            if (target >= n) break;
            target += slice;
        }
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * if-else 문으로 간결하게도 풀 수 있었다.
 * 왜 이런 생각은 못했지..
 */
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if (n%slice==0) answer = n/slice;
        else answer = (n/slice) + 1;
        return answer;
    }
}