public class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        int sum = 0;
        for(int i = nums.length - 2;i >= 0;i -= 2){
            sum += nums[i];
        }
        return sum;
    }
}

// Arrays Àà ½Ó¿Ú