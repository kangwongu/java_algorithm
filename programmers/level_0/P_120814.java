/**
 * 나의 풀이
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        int slicedPizzaCount = 0;
        while (true) {
            answer++;
            slicedPizzaCount += 7;
            if (slicedPizzaCount>=n) break;
        }

        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 왜 이쪽으론 생각이 안되지..
 * 이렇게 생각이 안된다..
 */
class Solution {
    public int solution(int n) {
        int answer = 0;

        if ((n%7) == 0) answer = n/7;
        else answer = (n/7)+1;

        return answer;
    }
}