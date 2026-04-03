public class MergeArray{
   public static void main(String[] args) {
        int[] arr1 = {1,6,3};
        int[] arr2 = {4,5,2};

        int[] merged = new int[arr1.length+arr2.length];
    int k = 0;
        for(int i = 0;i<arr1.length;i++){
            merged[k++] = arr1[i];
        }
        for(int j = 0; j<arr2.length;j++){
            merged[k++] = arr2[j];
        }
        java.util.Arrays.sort(merged);

        for(int x : merged){
            System.out.print(x+" ");
        }
        // System.out.print(merged);
    }
}