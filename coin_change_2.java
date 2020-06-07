import java.util.ArrayList;
import java.util.HashMap;

public class coin_change_2 {
    public static void main(String[] args) {
        System.out.println("Dynamic programming bottom up solution");
    }
}

class So {
    public int change(int amount, int[] coins) {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        return ways(amount, coins, 0, map);
    }
    private int ways(int amount, int[] coins, int curr, HashMap<ArrayList<Integer>, Integer> map){
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }
        if(curr == coins.length){
            if(amount == 0){
                return 1;
            }
            return 0;
        }
        ArrayList<Integer> cans = new ArrayList<>();
        cans.add(amount);
        cans.add(curr);
        if(map.containsKey(cans)){
            return map.get(cans);
        }
        int ans = 0;
        for(int i = curr; i <= coins.length - 1; i++){
            ans = ans + ways(amount - coins[i], coins, i, map);
        }
        map.put(cans, ans);
        return ans;
    }
}