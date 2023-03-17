// https://leetcode.com/problems/search-insert-position

class Solution {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
			return 0;
		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] <= target && target <= nums[i + 1]) {
				if (nums[i] == target) {
					return i;
				} else {
					return i + 1;
				}
			}
		}
		return nums.length;
    }
}