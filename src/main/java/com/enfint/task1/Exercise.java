package com.enfint.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise {

    public List<Integer> findDuplicates(List<Integer> integerList, int numberOfDuplicates) {
        // TODO: task
        if(integerList == null) {
            return new ArrayList<>();
        } else {
            return integerList.stream()
                    .filter(num ->
                            Collections.frequency(integerList, num) == numberOfDuplicates && num != null)
                    .distinct()
                    .collect(Collectors.toList());
        }

    }
}