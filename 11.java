public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxA = 0;
        while(left<right){
            maxA = Math.max(maxA, (right-left)*Math.min(height[left],height[right]));
            if(height[left]<height[right]) left++;
            else right--;
        }
        return maxA;
    }
}
// Ì°ÐÄËã·¨   Ë«Ö¸Õë   Âß¼­ÍÆÀí   Âß¼­Ö¤Ã÷¡£ O(N)  ËÑË÷¿Õ¼ä¼ôÖ¦