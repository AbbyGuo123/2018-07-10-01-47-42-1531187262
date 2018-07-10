package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        if(left>right){
            int temp = left;
            left = right;
            right = temp;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=right;i<=left;i--){
            list.add(i);
        }
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
        for(int i=right;i<=left;i--){
            if(i%2==0)
            list.add(i);
        }
        if(flag)list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
