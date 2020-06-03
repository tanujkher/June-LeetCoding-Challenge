import java.util.ArrayList;
import java.util.HashMap;

public class two_city_scheduling {
    public static void main(String[] args) {
        System.out.println("Dynamic programming solution with hashmap as we cann't keep track of negative city count and current");
    }
}

class Sol {
    public int twoCitySchedCost(int[][] costs) {
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        return findMinCost(costs, 0, 0, map);
    }
    private int findMinCost(int[][] costs, int ccount, int curr, HashMap<ArrayList<Integer>, Integer> map){
        if(curr == costs.length){
            if(ccount == 0){
                return 0;
            }
            return Integer.MAX_VALUE / 2;
        }
        ArrayList<Integer> cans = new ArrayList<>();
        cans.add(ccount);
        cans.add(curr);
        if(map.containsKey(cans)){
            return map.get(cans);
        }
        int Afly = findMinCost(costs, ccount + 1, curr + 1, map) + costs[curr][0];
        int Bfly = findMinCost(costs, ccount - 1, curr + 1, map) + costs[curr][1];
        map.put(cans, Math.min(Afly, Bfly));
        return map.get(cans);
    }
}