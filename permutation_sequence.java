
public class permutation_sequence {
    public static void main(String[] args) {
        System.out.println("Simply find the permutations and keep a check for finans to be empty or not");
    }
}

class u {
    public String getPermutation(int n, int k) {
        String bans = "";
        for(int i = 1; i <= n; i++){
            bans = bans + i;
        }
        int[] curr = new int[1];
        curr[0] = k;
        String[] ans = new String[1];
        ans[0] = "";
        getPermutations(bans, curr, "", ans);
        return ans[0];
    }
    private void getPermutations(String bans, int[] curr, String ans, String[] finans){
        if(finans[0].length() != 0){
            return;
        }
        if(bans.length() == 0){
            curr[0] = curr[0] - 1;
            if(curr[0] == 0){
                finans[0] = ans;
            }
            return;
        }
        for(int i = 0; i <= bans.length() - 1; i++){
            getPermutations(bans.substring(0, i) + bans.substring(i + 1), curr, ans + bans.charAt(i), finans);
        }
    }
}