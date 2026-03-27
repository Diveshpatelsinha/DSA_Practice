import java.util.Arrays;

public class Remove_Duplicate {
    public static void main(String[] args) {
         int[] arr = {1,2,3,5,5,6,2,8,9};

         Arrays.sort(arr);
         
         int j = 0;
         for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[j]){
                arr[++j] = arr[i];
            }
         }
         
         //System.out.println(Arrays.toString(arr));
         for(int i = 0; i<=j;i++){
            System.out.print(arr[i]+" ");
         }

    }
    
}
