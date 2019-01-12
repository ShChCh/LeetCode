class Solution {
public:
    int findComplement(int num) {
		int input = num;
        int base = 1;
		int result = 0;
		while(input!=0){
			if(input%2==0)
				result = result + base;
			input/=2;
			base *= 2;
		}
		return result;
    }
};