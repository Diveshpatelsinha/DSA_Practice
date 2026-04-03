public class ReverseArray {

    static void reverse(int[] arr, int i, int j ){
        // int i =0;
        // int j = arr.length-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }
    }
    public static void main(String[] args) {
          int[] arr = {1,3,4,5,6,7,8,9};

         reverse(arr, 0, arr.length-1);

          for(int x : arr){
            System.out.print(x+" ");
          }
    }
}
