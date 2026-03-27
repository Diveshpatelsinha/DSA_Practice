public class Find_Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};
        int n = arr.length+1;

        int sum = n*(n+1)/2;
        int actual = 0;

        for(int i : arr){
            actual +=i;
        }
       System.out.println(sum-actual);
        System.out.println(arr.length);
       

       
    }
}
