public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums==null || nums.length==0) return nums;
        int sizeR = nums.length;
        int sizeC = nums[0].length;
        if(sizeR*sizeC != r*c) return nums;
        int[][] ret = new int[r][c];
        int count = 0;
        for(int i=0; i<nums.length; i++)
            for(int j=0; j<nums[i].length; j++){
                ret[count/c][count%c] = nums[i][j];
                count++;
            }
        return ret;
    }
}
// 二维数组的声明，创建，坐标运算