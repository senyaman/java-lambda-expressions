package com.enfint.task4;

import java.util.*;

public class EvenAndOddFinder {
    Map<CharacterType, Set<String>> findFromCollection(List<Set<String>> input) {
        // TODO: task4
        Map<CharacterType, Set<String>> evenOdd = new HashMap<>();

        Set<String> evenWordsSet = new HashSet<>();
        Set<String> oddWordSet = new HashSet<>();

        if (input == null) {
            evenOdd.put(CharacterType.ODD, oddWordSet);
            evenOdd.put(CharacterType.EVEN, evenWordsSet);
        } else {
            for (Set<String> strings : input) {
                if(strings != null) {
                    for (String s : strings) {
                        if (s != null && !s.equals("")) {
                            if (s.length() % 2 == 0) {
                                evenWordsSet.add(s);
                                evenOdd.put(CharacterType.EVEN, evenWordsSet);
                            } else {
                                oddWordSet.add(s);
                                evenOdd.put(CharacterType.ODD, oddWordSet);
                            }
                        }
                    }
                }
            }

        }
        return evenOdd;

    }
}
