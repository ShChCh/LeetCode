class Solution {
    public int removeElement(int[] nums, int val) {
    	int len = nums.length;
    	int ite = 0;
    	for(int i=0; i<nums.length; i++)
    		if(nums[i]==val)
    			len--;
    		else
    		{
    			nums[ite++] = nums[i];
    		}
    	return len;
    }
}