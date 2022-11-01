/**
 * 나의 풀이
 */
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) answer = 1;
        else if (dot[0] < 0 && dot[1] > 0) answer = 2;
        else if (dot[0] < 0 && dot[1] < 0) answer = 3;
        else answer = 4;
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 내가 푼 풀이보다 훨씬 간결해보인다
 */
class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0)
            if(dot[1] > 0) answer = 1;
            else answer = 4;
        else
            if(dot[1] > 0) answer = 2;
            else answer = 3;

        return answer;
    }
}