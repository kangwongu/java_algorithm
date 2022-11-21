/**
 * switch문을 통해 분기처리하고, for문을 통해 left, right에 맞게 배열의 요소를 조정했다
 */
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        switch (direction) {
            case "left":
                answer[numbers.length-1] = numbers[0];
                for (int i=0; i<numbers.length-1; i++) answer[i] = numbers[i+1];
                break;
            case "right":
                answer[0] = numbers[numbers.length-1];
                for (int i=0; i<numbers.length-1; i++) answer[i+1] = numbers[i];
                break;
        }
        return answer;
    }
}