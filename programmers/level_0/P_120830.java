/**
 * 나의 풀이
 * while문을 통해 양꼬치 주문 수가 10 이상이면 k--했다.
 * 이렇게 양꼬치 값과 음료수 값을 구했다
 */
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int nPrice = n*12000;
        while (n >= 10) {
            k--;
            n -= 10;
        }
        int kPrice = k*2000;
        answer = nPrice + kPrice;

        return answer;
    }
}

/**
 * 다른 사람 풀이
 * 간단하게 총 가격을 구한 후, 양꼬치 주문 수가 10 이상이면 추가되는 음료수 값을 구해서 빼줬다.
 * 훨씬 간결하게 해결할 수 있었다
 */
class Solution {
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}