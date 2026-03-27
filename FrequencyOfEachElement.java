import java.util.HashMap;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,4};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr1){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int key : map.keySet()){
            System.out.println(key + " : " + map.get(key) );
        }
    }

}
