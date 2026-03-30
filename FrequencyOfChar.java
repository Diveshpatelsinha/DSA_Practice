import java.util.HashMap;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String s = "abcdabcffg";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char ch : map.keySet()){
            System.out.println(ch + " -> "+map.get(ch));
        }
    }
}
