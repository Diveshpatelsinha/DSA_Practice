public class Min {
    


    public static void main(String[] args){
        int[] arr = {1,5,4,3,7,8,0};
        int min = Integer.MAX_VALUE;

        for(int i : arr){
            // if(i<min){
            //     min = i;
            // }
            min = Math.min(min, i);
        }
        System.out.println(min);
    }
}