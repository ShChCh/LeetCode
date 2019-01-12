public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] save = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            save[i] = nums[i];
        }
        Arrays.sort(nums);
        int[] ret = new int[2];
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                int a0 = -1;
                int a1 = -1;
                for(int i=0; i<save.length; i++){
                    if(save[i]==nums[left] && a0==-1){
                        ret[0] = i;
                        a0 = i;
                    }
                    else if(save[i]==nums[right] && a1==-1){
                        ret[1] = i;
                        a1 = i;
                    }
                    if(a0!=-1 && a1!=-1) return ret;
                }
                return ret;
            }
            if(nums[left]+nums[right]>target) right--;
            if(nums[left]+nums[right]<target) left++;
            
        }
        return null;
    }
}

// 双指针  坐标变换  贪心