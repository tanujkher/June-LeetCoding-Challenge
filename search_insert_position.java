
public class search_insert_position {
    public static void main(String[] args) {
        System.out.println("Used binary search to find nearest position and then forward and reverse search for correct index");
    }
}

class Sou {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]){
            return nums.length;
        }
        if(target < nums[0]){
            return 0;
        }
        if(nums.length == 0){
            return 0;
        }
        int maybe = -1;
        int lo = 0;
        int hi = nums.length - 1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(nums[mid] > target){
                hi = mid - 1;
            }else if(nums[mid] < target){
                lo = mid + 1;
            }else{
                return mid;
            }
            maybe = mid;
        }
        for(int i = 0; i <= nums.length - 1; i++){
            if(nums[i] < target && i + 1 <= nums.length - 1 && nums[i + 1] > target){
                return i + 1;
            }
        }
        return maybe;
    }
}