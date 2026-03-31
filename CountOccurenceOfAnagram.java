


public class CountOccurenceOfAnagram {

    static boolean allZero(int[] freq){
        for(int f : freq){
            if(f != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        int k = p.length();
        int anagram = 0;

        int[] freq = new int[26];

        for(char c : p.toCharArray()){
            freq[c- 'a']++;
        }

        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)- 'a']--;

            if(i>=k){
                freq[s.charAt(i-k)- 'a']++;
            }

           if(allZero(freq)) anagram++;
            

           
        }
       


        System.out.println(anagram);

         

    }
}
