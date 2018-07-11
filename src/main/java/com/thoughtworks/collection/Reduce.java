package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        return this.arrayList.stream().max((x,y)->x-y).get();
    }

    public double getMinimum() {
        return this.arrayList.stream().min((x,y)->x-y).get();
    }

    public double getAverage() {
        return (double)(this.arrayList.stream().reduce((sum,item)->sum+item).get())/(double) this.arrayList.size();
    }

    public double getOrderedMedian() {
        this.arrayList.stream().sorted();
        int k = arrayList.size();
        if(k%2==0){
            return (double) (arrayList.get(k/2-1)+arrayList.get(k/2))/2;
        }
        return arrayList.get(k/2);
    }

    public int getFirstEven() {
        return this.arrayList.stream().filter(x->x%2==0).collect(Collectors.toList()).get(0);
    }

    public int getIndexOfFirstEven() {
        for(int i=0;i<this.arrayList.size();i++){
            if(this.arrayList.get(i)%2==0)
                return i;
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        String arrayListA = arrayList.toString();
        String arrayListB = this.arrayList.toString();
        return arrayListA.equals(arrayListB);
    }

    public Double getMedianInLinkList(SingleLink singleLink) {
//        this.arrayList = this.arrayList.stream().sorted().collect(Collectors.toList());
        int index = this.arrayList.size()/2;
        if(this.arrayList.size()%2!=0){
            return (double) this.arrayList.get(index);
        }
        else
            return ((double)this.arrayList.get(index)+(double)this.arrayList.get(index-1))/2;

    }

    public int getLastOdd() {
        Collections.reverse(this.arrayList);
        for(int x:this.arrayList){
            if(x%2==1)
                return x;
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        Collections.reverse(this.arrayList);
        for(int x =this.arrayList.size()-1;x>=0;x--){
            if(x%2==1)
                return x;
        }
        return -1;
    }
}
