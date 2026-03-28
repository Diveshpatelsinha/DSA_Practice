import java.util.HashMap;

public class MajorityElement {
    //greater than n/2

    public static void main(String[] args) {
        int[] arr = {1};

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr ){
            map.put(num, map.getOrDefault(num,0 )+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>arr.length/2){
                System.out.println(key);
            }else{
                System.out.println("no element is greater than n/2");
            }
        }
    }
}
