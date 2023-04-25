// https://leetcode.com/problems/median-of-two-sorted-arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]nums3 = new int[nums1.length+nums2.length];
		for(int i = 0 ; i < nums1.length; i++) {
			nums3[i] = nums1[i];
		}
		for(int i = 0 ; i < nums2.length; i++) {
			nums3[nums1.length + i] = nums2[i];
		}
		Arrays.sort(nums3);
		if(nums3.length%2 == 0) {
			return (nums3[nums3.length/2 - 1]+ nums3[nums3.length/2])/2;
		}
		else {
			return nums3[nums3.length/2];
		}
    }
}