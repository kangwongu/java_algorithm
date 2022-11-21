/**
 * 나의 풀이
 * for문으로 해결
 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if ((6*i)%n==0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * while문, 무한루프를 사용해 해결
 */
class Solution {
    public int solution(int n) {
        int answer = 1;

        while(true){
            if(6*answer%n==0) break;
            answer++;
        }

        return answer;
    }
}