/** 189. Rotate Array */
void rotate(int nums[], int numsSize, int k) {
	// https://leetcode.com/problems/rotate-array/
	// https://leetcode-cn.com/problems/rotate-array/
	const int n = numsSize;
	k %= n;
	if (0 == k) {
		return;
	}
	if (k < 0) {
		k += n;
	}
	const int leftElemCnt = n - k;
	const int rightElemCnt = k;
	int i;
	int j;
	int swap;
	if (rightElemCnt > leftElemCnt) {
		// 把前i个元素对调到末尾i个格子
		for (i = 0, j = n - leftElemCnt + i; i < leftElemCnt && j < n;
				i++, j++) {
			swap = nums[i];
			nums[i] = nums[j];
			nums[j] = swap;
		}
		// 剩下数组中前n-i个元素需要重新排列
		int *leftSubArr = nums;
		rotate(leftSubArr, n - i, k - i);
	} else {
		// 把末尾i个元素对调到开头i个格子
		for (i = 0, j = leftElemCnt + i; i < leftElemCnt && j < n; i++, j++) {
			swap = nums[i];
			nums[i] = nums[j];
			nums[j] = swap;
		}
		// 剩下数组右侧的n-i个元素需要重新排列
		int *rightSubArr = nums + i;
		rotate(rightSubArr, n - i, k);
	}
}
