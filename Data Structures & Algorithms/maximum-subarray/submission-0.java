class Solution {
    public int maxSubArray(int[] nums) {
        int maxEnd = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            maxEnd = Math.max(sum, maxEnd);
        }
        return maxEnd;
    }
}
