public class Solution {
    public int[] countBits(int num) {
        int[] op = new int[32];
        int[] ret = new int[num+1];
        op[0] = 0x1;
        for(int j=1; j<32; j++){
            op[j] = op[j-1]<<1;
        }
        for(int i=1; i<=num; i++){
            ret[i] = 0;
            for(int j=0; j<32; j++)
                if(i>=op[j] && (i/op[j])%2==1)
                        ret[i]+=1;
        }
        return ret;
    }
}