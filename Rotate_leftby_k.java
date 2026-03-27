import java.util.*;
public class Rotate_leftby_k {
    public static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        int k = 2;
        int n = arr.length;
         k = k%n;

         reverse(arr, 0, k-1);
         reverse(arr, k, n-1);
         reverse(arr, 0, n-1);

        System.out.println(Arrays.toString(arr));
    }
}
