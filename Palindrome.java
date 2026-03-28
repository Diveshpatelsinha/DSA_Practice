public class Palindrome{
    public static void main(String[] args) {
        String s = "madam";

        int i = 0; 
        int j = s.length()-1;
        boolean isPal = true;

        while(i<j){
          if(s.charAt(i)!=s.charAt(j)){
            isPal = false;
          }
        }
        if(isPal){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}