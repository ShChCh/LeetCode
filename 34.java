class Solution {
    public void _searchRange(int[] nums, int start, int last, int target, int[] re){
    	if(start>last || nums[start] > target || nums[last] < target)
    		return;
    	
    	if(nums[start] == target){
    		if(start < re[0])
    			re[0] = start;
			if(start > re[1])
				re[1] = start;
        }

	    if(nums[last] == target){
	    	if(last < re[0])
	    		re[0] = last;
			if(last > re[1])
				re[1] = last;
        }
	    if(start == last)
	    	return;
    	_searchRange(nums, start, (start+last)/2, target, re);
    	_searchRange(nums, (start+last)/2+1, last, target, re);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] re = new int[2];
        re[0] = nums.length;
        re[1] = -1;
        _searchRange(nums, 0, nums.length-1, target, re);
        if(re[0] == nums.length)
            re[0] = -1;
        return re;
    }
}