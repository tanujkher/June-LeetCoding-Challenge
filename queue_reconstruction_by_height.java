import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class queue_reconstruction_by_height {
    public static void main(String[] args) {
        System.out.println("First arrange in descending order of height and ascending order of persons in front for same height then add to answer list according to the sorted values at persons in front index");
    }
}
class Solu {
    public int[][] reconstructQueue(int[][] people) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int[] val : people){
            if(map.containsKey(val[0])){
                map.get(val[0]).add(val[1]);
            }else{
                ArrayList<Integer> bans = new ArrayList<>();
                bans.add(val[1]);
                map.put(val[0], bans);
            }
        }
        ArrayList<Integer> ks = new ArrayList<>(map.keySet());
        Collections.sort(ks);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i = ks.size() - 1; i >= 0; i--){
            Collections.sort(map.get(ks.get(i)));
            for(int val : map.get(ks.get(i))){
                ArrayList<Integer> cans = new ArrayList<>();
                cans.add(ks.get(i));
                cans.add(val);
                ans.add(val, cans);
            }
        }
        int[][] finans = new int[people.length][2];
        int i = 0;
        for(ArrayList<Integer> val : ans){
            finans[i][0] = val.get(0);
            finans[i][1] = val.get(1);
            i++;
        }
        return finans;
    }
}