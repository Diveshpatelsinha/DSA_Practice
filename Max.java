public class Max{
    public static void main(String[] args){
        int[] arr = {1,5,4,3,7,8,8};
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            // if(i>max){
            //     max = i;
            // }
            max = Math.max(i, max);
        }
        System.out.println(max);
    }
}