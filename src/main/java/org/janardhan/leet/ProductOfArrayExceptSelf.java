package org.janardhan.leet;

import org.janardhan.input.FastReader;

/**
 *
 *
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 *
 * Example:
 *
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 * Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
 *
 * Note: Please solve it without division and in O(n).
 *
 * Follow up:
 * Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 *
 *
 */

public class ProductOfArrayExceptSelf {

    private static FastReader fr= new FastReader();

    public static void main(String[] args) {


        System.out.println("Enter array size");
        int size = fr.nextInt();
        int[] a = new int[size];
        int[] result;

        for (int i = 0; i < size; i++) {
            a[i] = fr.nextInt();
        }

        result = productExceptSelf(a);

    }

    private static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result =  new int[nums.length];

        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i] * left[i - 1];
        }
        right[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--) {
            right[i] = nums[i] * right[i +1 ];
        }

        result[0] = right[1];
        result[nums.length-1]= left[nums.length-2];
        for(int i=1; i< nums.length-1; i++){
            result[i] = right[i+1] * left[i-1];
        }

        return result;
    }
}
