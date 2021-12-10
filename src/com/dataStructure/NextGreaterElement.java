package com.dataStructure;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 4, 8, 1};
        boolean isGreaterFound;
        for (int i = 0; i < arr.length - 1; i++) {
            isGreaterFound = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                    isGreaterFound = true;
                    break;
                }
            }
            if (!isGreaterFound) {
                arr[i] = -1;
            }
        }
        arr[arr.length - 1] = -1;

        System.out.println(Arrays.toString(arr));
    }
}
