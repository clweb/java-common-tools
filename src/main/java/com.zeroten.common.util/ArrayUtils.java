package com.zeroten.common.util;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ArrayUtils {

    public static int[] sort(int[] arr){

        if(arr != null) {
            for (int index = 0; index < arr.length; index++) {
                for (int twoindex = index; twoindex <arr.length ; twoindex++) {
                    if (arr[index] > arr[twoindex ]) {
                        int temp = arr[index];
                        arr[index] = arr[twoindex];
                        arr[twoindex] = temp;
                    }
                }
            }
        }
        return arr;
    }
}
