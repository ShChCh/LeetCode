public class Solution {
    public int distributeCandies(int[] candies) {
        int[] hashTable = new int[200001];
        int max = 0;
        for(int i=0; i<candies.length; i++){
            hashTable[candies[i]+100000]++;
            if(max<candies[i]+100000) max=candies[i]+100000;
        }
        int no = candies.length/2;
        int count = 0;
        int[] ret = new int[no];
        for(int i=0; i<=max; i++){
            if(hashTable[i]>0) {
                ret[count++] = i;
                hashTable[i]--;
                if(count>=no) break;
            }
        }
        return count; 
    }
}
// 哈希表，桶排序，应用场景，哈希表散列多overlap值