package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        boolean flag =false;
        if(left>right){
            int temp = left;
            left = right;
            right = temp;
            flag =true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            list.add(i);
        }
        if(flag)
        Collections.reverse(list);
        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        boolean flag=false;
        if(left>right){
            int temp = left;
            left = right;
            right = temp;
            flag=true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i%2==0)
            list.add(i);
        }
        if(flag)
            Collections.reverse(list);
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().filter(x->x%2==0).collect(Collectors.toList());
        return list;
    }

    public int popLastElment(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.get(0);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> firstList = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        return firstList.stream().filter(x->secondList.contains(x)).collect(Collectors.toList());
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> firstList = Arrays.stream(firstArray).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(secondArray).collect(Collectors.toList());
        return Stream.concat(firstList.stream(),secondList.stream()).distinct().collect(Collectors.toList());
    }
}
