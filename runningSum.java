/*Description : Given an array nums We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
                Return the running sum of nums.
Example : Input: nums = [1,2,3,4]
          Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
package beginner_array_questions;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] runningsum = new int[arr.length];
        runningsum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            runningsum[i] = runningsum[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(runningsum));
    }
}
