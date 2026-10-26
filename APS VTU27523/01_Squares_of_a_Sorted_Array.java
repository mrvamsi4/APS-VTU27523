class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, l = 0, r = n - 1;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int a = nums[l] * nums[l], b = nums[r] * nums[r];
            if (a > b) { ans[i] = a; l++; }
            else { ans[i] = b; r--; }
        }
        return ans;
    }
}
