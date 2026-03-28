public class CountVowelConsonent {
    public static void main(String[] args) {
        String s = "Divesh patel";

        int vowel = 0;
        int consonent = 0;

        for(char c : s.toCharArray()){
            if("aeiouAeiou".indexOf(c)!=-1){
                vowel++;
            }else if(c==' '){
                continue;
            }
            else consonent++;
        }

        System.out.println(vowel);
        System.out.println(consonent);
    }
}
