package com.zeroten.common.utils;

import com.zeroten.common.util.CheckUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void testIsAnyEmpty(){
        boolean flag=false;
        Assert.assertEquals(CheckUtils.isAnyEmpty(""),flag);
        Assert.assertEquals(CheckUtils.isAnyEmpty(),flag);
        Assert.assertEquals(CheckUtils.isAnyEmpty(null),flag);
        Assert.assertEquals(CheckUtils.isAnyEmpty("",null,"1"),flag);
    }

    @Test
    public void testIsEmpty(){
        boolean flag=true;
        Object[] arr1={};
        Object[] arr2={""};
        Object[] arr3={null};
        Assert.assertEquals(CheckUtils.isEmpty(arr1),flag);
        Assert.assertEquals(CheckUtils.isEmpty(arr2),flag);
        Assert.assertEquals(CheckUtils.isEmpty(arr3),flag);
    }
    @Test
    public void testEqualString(){
        boolean flag=false;
        Assert.assertEquals(CheckUtils.equals("","123"),flag);
        Assert.assertEquals(CheckUtils.equals("123","12"),flag);
        Assert.assertEquals(CheckUtils.equals("123",""),flag);
        Assert.assertEquals(CheckUtils.equals("123","123w"),flag);
    }

    @Test
    public void testEqualsInteger(){
        boolean flag=false;
        Assert.assertEquals(CheckUtils.equals(null,1),flag);
        Assert.assertEquals(CheckUtils.equals(1,null),flag);

    }
}
