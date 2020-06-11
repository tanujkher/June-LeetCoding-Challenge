import java.util.HashMap;

public class sort_colors {
    public static void main(String[] args) {
        System.out.println("Simple hashmap solution to keep a track of number of occurences and special case of a missing integer");
    }
}

class Sn {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                map.put(val, map.get(val) + 1);
            }else{
                map.put(val, 1);
            }
        }
        int j = 0;
        for(int i = 1; i <= (map.containsKey(0) ? map.get(0) : 0); i++){
            nums[j] = 0;
            j++;
        }
        for(int i = 1; i <= (map.containsKey(1) ? map.get(1) : 0); i++){
            nums[j] = 1;
            j++;
        }
        for(int i = 1; i <= (map.containsKey(2) ? map.get(2) : 0); i++){
            nums[j] = 2;
            j++;
        }
    }
}