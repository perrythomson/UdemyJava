package main.chapter4.chapter6;

import java.util.*;

public class ListToArrayAndBack {
    public void usingPlainJavaFirstExample() {
        //list to an array
        List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
        Integer[] targetArray = sourceList.toArray(new Integer[sourceList.size()]);
        System.out.println(Arrays.toString(targetArray));
    }

    public void secondExample() {
        //array to a list
        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        List<Integer> targetList = Arrays.asList(sourceArray);
        System.out.println(Arrays.toString(sourceArray));
    }

    public void givenUsingCommonsCollections_whenArrayConvertedToList_thenOK() {
        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        List<Integer> targetList = new ArrayList<>(6);
        Collections.addAll(targetList, sourceArray);
        System.out.println(targetList.getClass());
    }
}
