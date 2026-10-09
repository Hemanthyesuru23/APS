class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int leftCount = i;
            int rightCount = n - i - 1;

            int leftDiff = nums[i] * leftCount - leftSum;
            int rightDiff = (totalSum - leftSum - nums[i])
                          - nums[i] * rightCount;

            result[i] = leftDiff + rightDiff;

            leftSum += nums[i];
        }

        return result;
    }
}