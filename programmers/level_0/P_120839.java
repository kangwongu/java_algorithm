/**
 * 아래와 같이 시도했었는데, 모든 문자열이 변경되서 실패
 *         for (int i=0; i<rsp.length(); i++) {
 *             if (rsp.charAt(i) == '2') rsp = rsp.replace("2","0");
 *             else if (rsp.charAt(i) == '0') rsp = rsp.replace("0","5");
 *             else if (rsp.charAt(i) == '5') rsp = rsp.replace("5","2");
 *             System.out.println("rsp["+i+"] = " + rsp);
 *         }
 *         answer = rsp;
 */

/**
 * String -> char 배열로 변경 후, 하나씩 순회하며 해결
 * String에 +=를 하면 계속 새로운 String 객체가 생기는 거기 때문에 StringBuilder를 사용
 */
class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] chars = rsp.toCharArray();
        for (char ch : chars) {
            if (ch == '2') sb.append('0');
            else if (ch == '0') sb.append('5');
            else if (ch == '5') sb.append('2');
        }
        answer = sb.toString();

        return answer;
    }
}

