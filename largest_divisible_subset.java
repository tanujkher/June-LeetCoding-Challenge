import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class largest_divisible_subset {
    public static void main(String[] args) {
        System.out.println("Backtracking solution using checking at start");
    }
}

class Sl {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length == 0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int prev = nums[0];
        int j = 1;
        List<Integer> bans = new ArrayList<>();
        for(; j <= nums.length - 1; j++){
            int curr = nums[j];
            bans.add(prev);
            if(curr % prev == 0){
                
            }else{
                break;
            }
            prev = curr;
        }
        bans.add(nums[nums.length - 1]);
        if(j == nums.length){
            return bans;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i <= nums.length - 1; i++){
            List<Integer> cans = largestsubset(nums, i);
            if(ans.size() < cans.size()){
                ans = cans;
            }
        }
        return ans;
    }
    private List<Integer> largestsubset(int[] nums, int lidx){
        List<Integer> ans = new ArrayList<>();
        boolean flag = false;
        for(int i = lidx + 1; i <= nums.length - 1; i++){
            if(nums[i] % nums[lidx] == 0 || nums[lidx] % nums[i] == 0){
                List<Integer> cans = largestsubset(nums, i);
                cans.add(nums[lidx]);
                if(ans.size() < cans.size()){
                    ans = cans;
                    flag = true;
                }
            }
        }
        if(!flag){
            ans.add(nums[lidx]);
        }
        return ans;
    }
}