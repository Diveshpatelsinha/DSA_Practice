import java.util.ArrayList;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
         int[] arr = {1,5,4,3,7,8,0};
    //      ArrayList<Integer> a = new ArrayList<>();
    //    // int [] a = new int[20];
    //      for(int i = arr.length-1; i>=0; i--){
    //        // System.out.print(arr[i] + " ");

    //        a.add(arr[i]) ;
    //      }
    //     // for(int x : a){
            
    //     // }
    //     //System.out.println(Arrays.toString(a));
    //     System.out.println(a);

    int i = 0; 
    int j = arr.length-1;
    while(i<j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    System.out.println(Arrays.toString(arr));
    }
}
