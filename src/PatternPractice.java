public class PatternPractice {

    public static boolean hasPairWithSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }

    public static int maxSumSubarrayOfSizeK(int[] nums, int k) {
        if (nums == null || nums.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            windowSum += nums[right];
            windowSum -= nums[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] sortedNums = {1, 2, 4, 6, 8, 11, 15};
        int target = 10;
        System.out.println("Pair with sum " + target + ": " + hasPairWithSum(sortedNums, target));

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Max sum subarray of size " + k + ": " + maxSumSubarrayOfSizeK(nums, k));
    }
}