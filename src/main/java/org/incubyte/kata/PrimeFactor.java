package org.incubyte.kata;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> generate(int integer) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (integer == 1) {
            return primeNumbers;
        }
        primeNumbers.add(integer);
        return primeNumbers;
    }
}
