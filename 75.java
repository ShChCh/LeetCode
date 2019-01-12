class Solution {
	public void bubble(int[] nums, int index) {
		for(int i=index; i>0; i--) {
			if(nums[i] < nums[i-1]) {
				int tmp = nums[i];
				nums[i] = nums[i-1];
				nums[i-1] = tmp;
			}
		}
	}
    public void sortColors(int[] nums) {
        for(int i=1; i<nums.length; i++) {
        	if(nums[i]<nums[i-1])
        		bubble(nums, i);
        }
    }
}