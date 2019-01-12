public class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int bit1 = 0;
        int bit2 = 0;
        while(x!=0 || y!=0){
            bit1 = x & 0x1;
            bit2 = y & 0x1;
            if(bit1 != bit2) count++;
            x = x>>1;
            y = y>>1;
        }
        return count;
    }
}

// ==================================

public class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int ret = x^y;
        int t = 1;
        while(ret!=0){
            if((ret & 1) == 1) count++;
            ret = ret >> 1;
        }
        return count;
    }
}

// 考察  位运算  符号优先级 （先&后==）
// & 与 | 或 ^ 异或 ~ 非