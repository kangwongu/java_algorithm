class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            // String의 i번째 문자가 처음 등장하는 문자인지
            if (my_string.indexOf(my_string.charAt(i)) == i) {
                sb.append(my_string.charAt(i));
            }
        }
        answer = sb.toString();
        return answer;
    }
}