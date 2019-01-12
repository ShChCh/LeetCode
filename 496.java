public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] ret = new int[findNums.length];
        for(int i=0; i<findNums.length; i++){
            int rhs = findNums[i];
            int find = -1;
            boolean begin = false;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==rhs) begin = true;
                if(begin && nums[j]>rhs){
                    find = nums[j];
                    break;
                }
            }
            ret[i] = find;
        }
        return ret;
    }
}