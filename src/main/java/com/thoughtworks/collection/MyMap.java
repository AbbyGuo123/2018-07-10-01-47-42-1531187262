package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return this.array.stream().map(x->x*3).collect(Collectors.toList());
    }

    public List<String> mapLetter() {
        return  this.array.stream().map( i -> letters[i-1]).collect(Collectors.toList());
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<>();
        boolean flag = false;
        for(int i=0;i<array.size();i++) {
            String a = "";
            String b = "";
            a = letters[(array.get(i)-1) % 26];
            if(array.get(i) / 26>0) {
                b = letters[(array.get(i)-1) / 26-1];
            }
            list.add(b+a);
        }
        return list;
    }

    public List<Integer> sortFromBig() {
        return this.array.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public List<Integer> sortFromSmall() {
        return this.array.stream().sorted().collect(Collectors.toList());
    }
}
