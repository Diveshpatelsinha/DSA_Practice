public class IsSorted {
    public static void main(String[] args) {
           int[] arr = {1,2,3,4,5,6};
            boolean sort = true;
           for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                sort = false;
            }
        }
        if(sort){

            System.out.println("sorted");
        }else System.out.println("not sorted");
    }
}
