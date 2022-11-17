/**
 * 나의 풀이
 * 문자열의 해당 문자를 찾는 indexOf 메소드를 사용했다.
 */
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String sNum = String.valueOf(num);
        String sK = String.valueOf(k);
        answer = sNum.indexOf(sK)==-1 ? -1 : sNum.indexOf(sK)+1;
        return answer;
    }
}
/**
 * 삼항 연산자를 활용해 좀 더 보기 쉽게 할 수 있따
 * answer = sNum.indexOf(sK);
 * return answer < 0 ? -1 : answer+1;
 */