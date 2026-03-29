import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "banana";
        HashSet<Character> set = new HashSet<>();
        String result = "";

        // for(char c : s.toCharArray()){
        //     set.add(c);
        // }
        // for(char c : set){
        //     result+=c;
        // }

        for(char c : s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                result+=c;
            }
        }

        System.out.println(result);

    }
}
