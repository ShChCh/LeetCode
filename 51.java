class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
		int[] queenList = new int[n]; // ?i?????????row??,Q??
		placeQueen(queenList, 0, n, res);// ??0??Q
		return res;
	}
 
	private void placeQueen(int[] queenList, int row, int n, 
			List<List<String>> res) {
		// ??????,?????
		if (row == n) {
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				String str = "";
				for (int col = 0; col < n; col++) {
					if (queenList[i] == col) {
						str += "Q";
					} else {
						str += ".";
					}
				}
				list.add(str);
			}
			res.add(list);
		}
		// ???????
		// ?????
		for (int col = 0; col < n; col++) {
			// ???????Q?????
			if (isValid(queenList, row, col)) { 
				// ????,??????????
				// ????????
				queenList[row] = col;
				placeQueen(queenList, row + 1, n, res);
			}
		}
	}
 
	private boolean isValid(int[] queenList, int row, int col) {
		for (int i = 0; i < row; i++) {
			// pos??
			int pos = queenList[i];
			// ?????Q?????
			if (pos == col) {
				return false;
			}
			// ?????Q??????
			if (pos + row - i == col) {
				return false;
			}
			// ?????Q??????
			if (pos - row + i == col) {
				return false;
			}
		}
		return true;

    }
}