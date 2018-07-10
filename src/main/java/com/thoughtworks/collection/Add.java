package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if(leftBorder>rightBorder){
            int temp =0;
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        for(int i=leftBorder;i<=rightBorder;i++){
            if(i%2==0)
                sum +=i;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if(leftBorder>rightBorder){
            int temp =0;
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        for(int i=leftBorder;i<=rightBorder;i++){
            if(i%2==1)
                sum +=i;
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        IntSummaryStatistics stats = arrayList.stream().mapToInt((x) -> x*3+2).summaryStatistics();
        return (int)stats.getSum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        List<Integer> resultList = arrayList.stream().map( i -> {
            if(i%2!=0) i=i*3+2;return i;
        }).collect(Collectors.toList());
        return  resultList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        IntSummaryStatistics stats = arrayList.stream().mapToInt((x) -> {
            if(x%2==1) x=x*3+5;
            return x;
        }).summaryStatistics();
        return (int)stats.getSum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
