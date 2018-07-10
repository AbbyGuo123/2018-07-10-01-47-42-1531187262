package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args){
        //求数组中所有偶数的平均数
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(array);

        Add add = new Add();
        add.getAverageOfEven(arrayList);
    }
}
