class Solution {
    public int removeDuplicates(int[] nums) {
    	int ite = 1;
    	for(int i=1; i<nums.length; i++) {
    		if(nums[i]!=nums[i-1])
    			nums[ite++] = nums[i];
    	}
    	return ite;
        
    }
}