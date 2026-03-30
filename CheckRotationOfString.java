public class CheckRotationOfString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";

        if(s1.length()==s2.length() && (s1+s2).contains(s2)){
            System.out.println("rotation exist");
        }else System.out.println("no rotation");
    }
}
