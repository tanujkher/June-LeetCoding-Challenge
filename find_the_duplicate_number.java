import java.util.HashMap;

public class find_the_duplicate_number {
    public static void main(String[] args) {
        System.out.println("Simple HashMap solution return the number as soon as encountered again");
    }
}

class ti {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums){
            if(map.containsKey(val)){
                return val;
            }else{
                map.put(val, 1);
            }
        }
        return -1;
    }
}