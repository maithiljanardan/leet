package org.janardhan.leet;

import java.util.Arrays;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] arr = {{2, 6}, {1, 3}, {8, 10}};
        int[][] mergeArr = merge(arr);
    }

    private static int[][] merge(int[][] arr) {

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(arr));
        return arr;
    }
}

