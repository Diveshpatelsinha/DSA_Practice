public class AllSubstring {
    public static void main(String[] args) {
        String s = "abc";

        for(int i=0;i<s.length();i++){
            String temp = "";
            for(int j = i; j<s.length();j++){
                temp+=s.charAt(j);
                System.out.println(temp);
            }
        }
        // System.out.println(s.length()-1);
    }
}


 // for (int i = 0; i < s.length(); i++) {      
 //            for (int j = i; j < s.length(); j++) {    
 //                System.out.println(s.substring(i, j + 1));
