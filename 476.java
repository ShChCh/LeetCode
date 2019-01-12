public class Solution {
    public int findComplement(int num) {
        int count = 1;
        int cmp = 0;
        int temp = num;
        while(temp>0){
            temp = temp>>1;
            count++;
            cmp = (cmp<<1) + 1;
        }
        return num^cmp;
    }
}
// È¥Î» Âß¼­ÔËËã