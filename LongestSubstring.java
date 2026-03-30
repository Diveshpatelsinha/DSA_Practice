import java.util.*;

class LongestSubstring {

    public static void main(String[] args) {
        String s = "Programming world";
        int maxlen = 0;
        int left  = 0;
        String sub = "";
        HashSet<Character> set = new HashSet<>();
        int r = 0;
        for( r = 0; r<s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(left));
                left++;
            }

            String word = "";
            for(int k = left;k<=r;k++){
                word +=s.charAt(k);
                System.out.println(word);
            }
            set.add(s.charAt(r));
            
            maxlen = Math.max(maxlen, r-left+1);
        }
        // for(char c : set ){
        //     System.out.print(c);
        // }
        for(int i = left;i<r;i++){
            sub+=s.charAt(i);
        }
        System.out.println("longest substring is: "+sub);
        System.out.println("length of longest substring is: "+maxlen);
    }
}
