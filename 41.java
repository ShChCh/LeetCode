class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int re = 1;
        int max = 1;
        
        for(int i=0; i<nums.length; i++)
        	if(nums[i]>max)
        		max = nums[i];
        
        int[] hashArr = new int[max+2];
        
        for(int i=0; i<nums.length; i++)
            if(nums[i]>=0)
        	    hashArr[nums[i]] = 1;
        
        for(int i=1; i<hashArr.length; i++)
        	if(hashArr[i] != 1)
        		return i;
        
        return re;
    }
}