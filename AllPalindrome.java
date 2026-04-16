import java.util.*;

class AllPalindrome {
    
   
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }

   
    public void backtrack(int idx, String s, List<String> curr,
                List<ArrayList<String>> res) {
                    
        if (idx == s.length()) {
          
            res.add(new ArrayList<>(curr));  
            return;
        }

        StringBuilder temp = new StringBuilder();
        
        for (int i = idx; i < s.length(); i++) {
            temp.append(s.charAt(i));
            String sub = temp.toString();
            if (isPalindrome(sub)) {
               
                curr.add(sub);                  
               
                backtrack(i + 1, s, curr, res); 
            
                curr.remove(curr.size() - 1);   
            }
        }
    }

   
    public ArrayList<ArrayList<String>> palinParts(String s) {
        
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), res);
        return res;
    }

    public static void main(String[] args) {
        
        GfG ob = new GfG();
        String s = "geeks";
        ArrayList<ArrayList<String>> res = ob.palinParts(s);

      
        for (ArrayList<String> part : res) {
            System.out.println(String.join(" ", part));
        }
    }
}
