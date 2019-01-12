class Solution {
    public void nextPermutation(int[] nums) {
		if (nums == null || nums.length <= 1)
			return;
        int i = nums.length - 2;
		while (i >= 0 && nums[i] >= nums[i + 1])
			i--;
		if (i >= 0) {
			int j = nums.length - 1;
			while (nums[j] <= nums[i])
				j--;
			swap(nums, i, j);
		}
		int k = nums.length - 1;
		i++;
		for (; i < k; i++, k--)
			swap(nums, i, k);
	}
	public void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
}