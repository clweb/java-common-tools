package com.zeroten.common.util;

import java.lang.String;
import java.util.Arrays;

public class CheckUtils {
    public static boolean isAnyEmpty(String... strings){
        if(strings instanceof String[]){
            for (int i = 0; i <strings.length ; i++) {
                    if(strings[i] == "" || strings[i] == null){
                        return false;
                    }else {
                        return true;
                    }

            }
        }
        return false;
    }

    public static boolean isEmpty(Object[] arr){
        if(arr instanceof Object[]){
            for (int i = 0; i <arr.length ; i++) {
                String str=(String) arr[i];
                if(str == "" || str == null){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean equals(String str1,String str2){
        if(str1 == null || str2 == null){
            return false;
        }else{
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();
            if(ch1.length == ch2.length) {
                for (int i = 0; i < ch1.length; i++) {
                    if (ch1[i] != ch2[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean equals(Integer n1,Integer n2){
        if(n1 == null || n2 == null){
            return false;
        }
        if(n1.intValue() == n2.intValue()){
            return true;
        }
        return false;
    }
}
