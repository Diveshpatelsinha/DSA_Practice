import java.util.*;
public class CheckAnagram {
    public static void main(String[] args) {
        String s = "silent";
        String s2 = "listen";

        char[] a = s.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

            boolean isAnagram = Arrays.equals(a, b);
            System.out.println(isAnagram);

    
    }
}
