package org.example;

class Solution {
    public void sortColors(int[] nums) {

        if (nums.length < 2) return;

        int low = 0;
        int mid = 0;
        int helper;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                helper = nums[low];
                nums[low] = nums[mid];
                nums[mid] = helper;
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else if (nums[mid] == 2) {
                helper = nums[high];
                nums[high] = nums[mid];
                nums[mid] = helper;
                high--;
            }
        }
    }
}
