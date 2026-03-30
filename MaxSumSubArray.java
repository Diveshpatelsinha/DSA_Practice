public class MaxSumSubArray{
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxsum = 0;
        int subsum = 0;

        for(int i = 0;i<k;i++){
            subsum+=arr[i];
        }

        for(int j = k; j<arr.length;j++){
            subsum+=arr[j];
            subsum-=arr[j-k];
            maxsum = Math.max(maxsum, subsum);
        }
        System.out.println(maxsum);
    }
}