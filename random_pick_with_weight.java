import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class random_pick_with_weight{
    public static void main(String[] args) {
        System.out.println("Simply copy index weight number of times in an array and then search or binary search with random index from 0 to sum is efficient");
    }
}

class Soln {
    List<Integer> wsum;
    int sum;
    Random r;
    public Soln(int[] w) {
        r = new Random();
        wsum = new ArrayList<>();
        sum = 0;
        wsum.add(sum);
        for(int val : w){
            sum = sum + val;
            wsum.add(sum);
        }
    }
    
    public int pickIndex() {
        int index = Collections.binarySearch(wsum, r.nextInt(sum));
        return index >= 0 ? index : - (index + 2);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */