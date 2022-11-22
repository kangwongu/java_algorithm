import java.util.Map;
import java.util.HashMap;

/**
 * Map을 사용해 해결
 */
class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        map.put(".-", "a");
        map.put("-...", "b");
        map.put("-.-.", "c");
        map.put("-..", "d");
        map.put(".", "e");
        map.put("..-.", "f");
        map.put("--.", "g");
        map.put("....", "h");
        map.put("..", "i");
        map.put(".---", "j");
        map.put("-.-", "k");
        map.put(".-..", "l");
        map.put("--", "m");
        map.put("-.", "n");
        map.put("---", "o");
        map.put(".--.", "p");
        map.put("--.-", "q");
        map.put(".-.", "r");
        map.put("...", "s");
        map.put("-", "t");
        map.put("..-", "u");
        map.put("...-", "v");
        map.put(".--", "w");
        map.put("-..-", "x");
        map.put("-.--", "y");
        map.put("--..", "z");

        String[] splitLetter = letter.split(" ");
        for (String str : splitLetter) {
            sb.append(map.get(str));
        }
        answer = sb.toString();
        return answer;
    }
}

// String의 replace메소드로 시도했지만 실패
//        answer = letter.replace(".-","a").replace("-...","b").replace("-.-.","c")
//                .replace("-..","d").replace(".","e").replace("..-.","f")
//                .replace("'--.","g").replace("....","h").replace("..","i")
//                .replace(".---","j").replace("-.-","k").replace(".-..","l")
//                .replace("--","m").replace("-.","n").replace("---","o").replace(".--.","p")
//                .replace("--.-","q").replace(".-.","r").replace("...","s")
//                .replace("-","t").replace("..-","u").replace("...-","v")
//                .replace(".--","w").replace("-..-","x").replace("-.--","y")
//                .replace("--..","z");
