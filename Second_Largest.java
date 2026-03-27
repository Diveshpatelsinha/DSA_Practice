public class Second_Largest {
    public static void main(String[] args) {
         int[] arr = {1,5,4,3,7,8,0};
         int max = Integer.MIN_VALUE;

         for(int i : arr){
            max = Math.max(i, max);
         }

         int second = Integer.MIN_VALUE;

         for(int j : arr){
            if(j>second && j<max){
                second = j;
            }
         }
         System.out.println(second);
    }
    
}

// int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

// for(int num : arr){
//     if(num > first){
//         second = first;
//         first = num;
//     } else if(num > second && num != first){
//         second = num;
//     }
// }
