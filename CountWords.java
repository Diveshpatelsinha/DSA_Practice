public class CountWords {
    public static void main(String[] args) {
        String s = "hello divesh how are you";
        // String[] result = s.trim().split("\\s+");

        // System.out.println("Words count: "+ result.length);
        int count = 0;
        boolean isword = false;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                if(!isword){
                    count++;
                    isword = true;
                }
            }else isword = false;
        }
        System.out.println(count);
    }
}
