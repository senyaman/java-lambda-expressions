package com.enfint.task2;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class ListOperation {

    public int integerSum(List<String> input) {

        if(input == null) {
            return 0;
        } else {
            return Stream.of(input)
                    .flatMap(Collection::stream)
                    .filter(Objects::nonNull)
                    .flatMap(str -> Arrays.stream(str.split(" |,")))
                    .filter(s -> s.matches("-?\\d+"))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
    }
}
