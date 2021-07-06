package org.janardhan.stck;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(nextGreaterElement(nums1, nums2));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for(int num : nums1){
            list.add(map.getOrDefault(num, -1));
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
