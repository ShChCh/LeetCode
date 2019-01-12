class Solution {
    public int totalHammingDistance(int[] nums) {
        
        int re = 0;
        // [0 : ?]
        // [1 : ?]
        int[][] result = new int[30][2];
        for(int i=0; i<30; i++)
        	for(int j=0; j<nums.length; j++){
        		if(nums[j] % 2 == 0)
        			result[i][0]++;
        		else
        			result[i][1]++;
                nums[j] /= 2;
            }
        for(int i=0; i<30; i++)
        	re += result[i][0] * result[i][1];
        return re;
    }
}