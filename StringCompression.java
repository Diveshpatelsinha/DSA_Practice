public class StringCompression {
    public static void main(String[] args) {
        String s = "aaabbc";
        int count = 1;
        String result = "";
        for(int i =1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                result += s.charAt(i-1)+""+count;
                count = 1;
            }
        }
        result += s.charAt(s.length()-1)+""+count;
        System.out.println(result);

    }
}
