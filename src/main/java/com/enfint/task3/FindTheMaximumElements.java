package com.enfint.task3;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FindTheMaximumElements {

    public List<BigDecimal> getThreeMaximum(List<String> input) {
        // TODO: task3
        if (input == null) {
            return new ArrayList<>();
        } else {
            return input.stream()
                    .filter(Objects::nonNull)
                    .map(BigDecimal::new)
                    .sorted(Comparator.reverseOrder())
                    .limit(3)
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());
        }
    }
}
