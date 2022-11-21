/**
 * 나의 풀이
 * order를 문자열로 바꾸고, 각 문자열 중 3/6/9가 있으면 answer++
 */
class Solution {
    public int solution(int order) {
        int answer = 0;
        String sOrder = String.valueOf(order);
        for (int i=0; i<sOrder.length(); i++) {
            if (sOrder.charAt(i) == '3' || sOrder.charAt(i) == '6'
                    || sOrder.charAt(i) == '9')
                answer++;
        }
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 1의 자리 수를 구하기 위해 %10을 한 후 3/6/9면 answer++
 * order /= 10 해가면서 갱신
 */
class Solution {
    public int solution(int order) {
        int answer = 0;

        while(order > 0){
            if(order % 10==3 || order% 10 ==6 || order% 10 ==9) answer++;
            order /= 10;
        }

        return answer;
    }
}