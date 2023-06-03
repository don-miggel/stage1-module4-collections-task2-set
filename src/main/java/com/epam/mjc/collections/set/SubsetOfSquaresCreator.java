package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        for (Integer item: sourceList){
            resultSet.add(item * item);
        }
        return resultSet.subSet(lowerBound,true,upperBound,true);

    }
}
