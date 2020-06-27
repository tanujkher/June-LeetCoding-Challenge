import java.util.HashMap;

public class perfect_squares {
    public static void main(String[] args) {
        System.out.println("Simple dp solution return number if less than 4 base case as it will sum with 1 else start a loop from 1 to i * i <= number and subtract from number");
    }
}

class tk {
    public int numSquares(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return getMinSquares(n, map);
    }
    private int getMinSquares(int n, HashMap<Integer, Integer> map){
        if(n < 4){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int count  = Integer.MAX_VALUE;
        for(int i = 1; i * i <= n; i++){
            count = Math.min(count, getMinSquares(n - i * i, map) + 1);
        }
        map.put(n, count);
        return count;
    }
}