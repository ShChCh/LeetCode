class Solution {
	public int _search(int[] nums, int first, int end, int target) {
		if(nums[(first+end)/2] == target)
			return (first+end)/2;
        if(first == end)
            if(nums[first] > target)
                return first;
            else
                return first+1;
		if(first>end)
			if(nums[end] < target)
				return end+1;
			else
				return end;
		if(nums[(first+end)/2] > target )
			return _search(nums, first, (first+end)/2, target);
		if(nums[(first+end)/2] < target)
			return _search(nums, (first+end)/2 +1 , end, target);
		return 0;
	}
    public int searchInsert(int[] nums, int target) {
    	return _search(nums, 0, nums.length-1, target);
    }
}