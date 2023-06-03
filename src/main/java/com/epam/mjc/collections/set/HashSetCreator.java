package com.epam.mjc.collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for(Integer item : sourceList){
            if(item % 2 == 0){
                int accumulatedDiv = item;
               do {
                    resultSet.add(accumulatedDiv);
                    accumulatedDiv/=2;
                } while (accumulatedDiv % 2 == 0);
                resultSet.add(accumulatedDiv);
            }else {
                resultSet.add(item);
                resultSet.add(2 * item);
            }
        }
        return resultSet;
    }
}
