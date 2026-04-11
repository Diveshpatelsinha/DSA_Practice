
//151. Reverse Words in a String
public String reverseWords(String s) {
    // trim removes leading/trailing spaces
    String[] words = s.trim().split("\\s+");

    StringBuilder result = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
        result.append(words[i]);
        if (i != 0) {
            result.append(" ");
        }
    }

    return result.toString();
}


public String reverseWords(String s) {
    char[] arr = s.toCharArray();
    int n = arr.length;

    // Step 1: clean spaces
    int i = 0, j = 0;
    while (j < n) {
        while (j < n && arr[j] == ' ') j++; // skip spaces
        while (j < n && arr[j] != ' ') arr[i++] = arr[j++]; // copy word
        while (j < n && arr[j] == ' ') j++; // skip spaces
        if (j < n) arr[i++] = ' '; // add single space
    }

    // resize
    int length = i;

    // Step 2: reverse whole string
    reverse(arr, 0, length - 1);

    // Step 3: reverse each word
    int start = 0;
    for (int end = 0; end <= length; end++) {
        if (end == length || arr[end] == ' ') {
            reverse(arr, start, end - 1);
            start = end + 1;
        }
    }

    return new String(arr, 0, length);
}

private void reverse(char[] arr, int left, int right) {
    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
