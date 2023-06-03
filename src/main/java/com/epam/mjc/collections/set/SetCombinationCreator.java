package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();
        resultSet.addAll(firstSet);

        resultSet.retainAll(secondSet);
        resultSet.removeAll(thirdSet);
        for (String str : thirdSet){
            if(!firstSet.contains(str) && !secondSet.contains(str))
                resultSet.add(str);
        }
        return resultSet;
    }
}
