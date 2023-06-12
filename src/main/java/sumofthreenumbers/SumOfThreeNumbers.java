package sumofthreenumbers;

import java.util.Arrays;

public class SumOfThreeNumbers {

    public boolean findSumOfThree(int[] nums, int target) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int currentNumber = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = currentNumber + nums[left] + nums[right];
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}
