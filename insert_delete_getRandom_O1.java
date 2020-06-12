import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class insert_delete_getRandom_O1 {
    public static void main(String[] args) {
        System.out.println("Simple solution using hashmap and random integer");
    }
}

class RandomizedSet {
    HashMap<Integer, Integer> map;
    Random r;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        r = new Random();
        map = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, 1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            map.remove(val);
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        ArrayList<Integer> ks = new ArrayList<>(map.keySet());
        int i = r.nextInt(ks.size());
        return ks.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */