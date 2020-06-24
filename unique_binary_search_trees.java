
public class unique_binary_search_trees {
    public static void main(String[] args) {
        System.out.println("Case of catalan number return 1 on 0 and 1 and else (i - 1) th * (n - i) th");
    }
}

class ou {
    public int numTrees(int n) {
        int[] strg = new int[n + 1];
        return getTrees(n, strg);
    }
    private int getTrees(int n, int[] strg){
        if(n == 0 || n == 1){
            return 1;
        }
        if(strg[n] != 0){
            return strg[n];
        }
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + getTrees(i - 1, strg) * getTrees(n - i, strg);
        }
        strg[n] = sum;
        return strg[n];
    }
}