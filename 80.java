class Solution {
    public int removeDuplicates(int[] nums) {
     
    	if(nums.length <= 2)
    		return nums.length;
        int re = 1;
        int count = 1;
        for(int i=1; i<nums.length; i++) {
        	if(nums[i] == nums[i-1])
        		count++;
        	else
        		count = 1;
        	if(count<=2) {
        		nums[re] = nums[i];
        		re++;
        	}
        }
        return re;   
    }
}