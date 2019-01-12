public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hashTable = new int[257];
        for(int j=0; j<hashTable.length; j++)
            hashTable[j] = -1;
        int count = 0;
        int ret = 0;
        for(int i=0; i<s.length(); i++)
        {
            char currentChar = s.charAt(i);
            if(hashTable[currentChar]==-1){
                hashTable[currentChar]=i;
                count++;
            }
            else{
                if(count>ret) ret = count;
                count = 0;
                i = hashTable[currentChar];
                for(int j=0; j<hashTable.length; j++)
                    hashTable[j] = -1;
            }
        }
        if(count>ret) ret = count;
        return ret;
    }
}
// hash table,  index pass, back tracing.