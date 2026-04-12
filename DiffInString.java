class Solution {
    public char findTheDifference(String s, String t) {
         int[] count = new int[26];

    for (char c : s.toCharArray()) {
        count[c - 'a']++;
    }

    for (char c : t.toCharArray()) {
        count[c - 'a']--;
        if (count[c - 'a'] < 0) {
            return c;
        }
    }

    return ' ';
    }
}

public char findTheDifference(String s, String t) {
    char result = 0;

    for (char c : s.toCharArray()) {
        result ^= c;
    }

    for (char c : t.toCharArray()) {
        result ^= c;
    }

    return result;
}
