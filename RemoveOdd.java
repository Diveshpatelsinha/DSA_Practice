import java.util.*;
public class RemoveOdd{

    static int[] removeodd(int[] arr){
        int k = 0;
        int oddnum = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2!=0){
                oddnum++;
            }
        }
            
            int[] result = new int[oddnum];

            for(int i = 0; i< arr.length;i++){
               if(arr[i]%2!=0){
                
                   result[k++] = arr[i];
               }
            }
            return result;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9};

        int[] result = removeodd(arr);
        // System.out.print(result);
        for(int x : result){
            System.out.print(x+" ");
        }
    }
}