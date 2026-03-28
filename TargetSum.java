import java.util.HashSet;

public class TargetSum{
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,8,2,9,5};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int compliment = target - num;

            if(set.contains(compliment)){
                System.out.println(compliment +", "+ num);
            }
            set.add(num);
        }
    }
}