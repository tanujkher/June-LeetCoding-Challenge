
public class unique_paths {
    public static void main(String[] args) {
        System.out.println("Simple maze path solution with strg dp top down");
    }
}

class nt {
    public int uniquePaths(int m, int n) {
        int[][] strg = new int[m + 1][n + 1];
        return getUniquePaths(m, n, strg);
    }
    private int getUniquePaths(int m, int n, int[][] strg){
        if(m == 1 && n == 1){
            return 1;
        }
        if(m <= 0 || n <= 0){
            return 0;
        }
        if(strg[m][n] != 0){
            return strg[m][n];
        }
        int ans = 0;
        ans = ans + getUniquePaths(m - 1, n, strg);
        ans = ans + getUniquePaths(m, n - 1, strg);
        strg[m][n] = ans;
        return ans;
    }
}