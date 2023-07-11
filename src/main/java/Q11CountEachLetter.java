import java.util.HashMap;
import java.util.Map;

public class Q11CountEachLetter {
    // techtorial
    public static void main(String[] args) {
        String input ="techtorial";
        Map<Character, Integer> answer = new HashMap<>();
        for (int i=0; i<input.length(); i++){
            if (!answer.containsKey(input.charAt(i))){
                answer.put(input.charAt(i), 1);
            }else {
                answer.put(input.charAt(i), answer.get(input.charAt(i))+1);
            }
        }
        System.out.println(answer);
    }
}
