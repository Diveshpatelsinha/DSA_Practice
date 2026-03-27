import java.util.HashSet;

public class Count_Duplicate_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,2,8,9};

        HashSet<Integer> set = new HashSet<>();

        for ( int num : arr) {
            if(!set.add(num)){
                System.out.println(num);
            }else System.out.println("no duplicate");
        }
    }
}
