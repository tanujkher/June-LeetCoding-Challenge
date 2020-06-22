import java.util.HashMap;

public class single_number_II {
    public static void main(String[] args) {
        System.out.println("HashMap solution add to hashmap and look for single occurence");
    }
}

class i {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                map.put(val, map.get(val) + 1);
            }else{
                map.put(val, 1);
            }
        }
        for(int val : map.keySet()){
            if(map.get(val) == 1){
                return val;
            }
        }
        return -1;
    }
}