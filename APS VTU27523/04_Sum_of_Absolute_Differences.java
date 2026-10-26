class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length, total = 0, left = 0;
        for (int x : nums) total += x;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i] * i - left + total - left - nums[i] * (n - i);
            left += nums[i];
            total -= nums[i];
        }
        return ans;
    }
}
