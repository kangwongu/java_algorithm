/**
 * 나의 풀이
 * for문에서 변수를 2개 선언
 * 하나는 증가, 하나는 감소 -> num_list 배열을 역순으로 담았다
 */
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i=num_list.length-1, j=0; i>=0; i--, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}

/**
 * 다른 사람 풀이
 * num_list.length-i-1
 */
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i< num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];
        }
        return answer;
    }
}