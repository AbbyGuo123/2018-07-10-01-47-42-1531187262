package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            return x%2==1?x*3+5:0;
        }).summaryStatistics();
        return (int)stats.getSum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        arrayList.stream().sorted();
        int index = (int)arrayList.size()/2;
        return arrayList.get(index);
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        int k=0;
        IntSummaryStatistics stats = arrayList.stream().filter(x->x%2==0).mapToInt((x) -> x).summaryStatistics();
        return stats.getAverage();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return arrayList.stream()
                .filter(x -> x%2==0)
                .anyMatch(x ->x==specialElment );
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(x -> x%2==0).distinct().collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {

        List<Integer> arrayList1 = arrayList.stream()
                .filter(x -> x%2==0).sorted().collect(Collectors.toList());
        List<Integer> arrayList2 = arrayList.stream()
                .filter(x -> x%2!=0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        return Stream.concat(arrayList1.stream(),arrayList2.stream()).collect(Collectors.toList());

    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
