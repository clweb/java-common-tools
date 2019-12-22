package com.zeroten.common.utils;

import com.zeroten.common.util.ArrayUtils;
import org.testng.annotations.Test;

import java.util.Arrays;

public class ArrayUtilsTest {
    @Test
    public void testSort(){
        int[] arr={1,5,4,6,2,3,8,95,42,63};
        System.out.println("排序前："+ Arrays.toString(arr));
        ArrayUtils.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
