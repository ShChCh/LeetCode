public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] HashTable = new int[nums.length+1];
        List<Integer> ret = new ArrayList<Integer>();
        for(int i=0 ; i<nums.length; i++){
            if(HashTable[nums[i]]==0) HashTable[nums[i]]++;
            else ret.add(nums[i]);
        }
        return ret;
    }
}