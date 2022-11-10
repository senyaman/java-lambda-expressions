package com.enfint.task4;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndOddFinder {
    // TODO: task4
    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {

        Map<CharacterType, Set<String>> evenOdd = new HashMap<>();

        Set<String> evenWordsSet = new HashSet<>();
        Set<String> oddWordSet = new HashSet<>();

        if (input == null) {
            evenOdd.put(CharacterType.ODD, oddWordSet);
            evenOdd.put(CharacterType.EVEN, evenWordsSet);
        } else {
            evenWordsSet = input.stream()
                    .filter(Objects::nonNull)
                    .map(even -> even.stream()
                            .filter(e -> e != null && !e.isEmpty())
                            .filter(e -> e.length() % 2 == 0)
                            .collect(Collectors.toList()))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());

            oddWordSet = input.stream()
                    .filter(Objects::nonNull)
                    .map(even -> even.stream()
                            .filter(e -> e != null && !e.isEmpty())
                            .filter(e -> e.length() % 2 != 0)
                            .collect(Collectors.toList()))
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());

            evenOdd.put(CharacterType.EVEN, evenWordsSet);
            evenOdd.put(CharacterType.ODD, oddWordSet);
        }

        return evenOdd;
    }


}
