public class KadaneAlgo{
    public static void main(String[] args) {
         int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

         int currentsum = 0;
         int maxsum = 0;

         for(int i = 0; i<arr.length;i++){
            currentsum = Math.max(arr[i], currentsum+arr[i]);
            maxsum = Math.max(maxsum, currentsum);
         }
         System.out.println(maxsum);
    }
}