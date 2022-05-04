package org.incubyte.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> generate(int number) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (number == 1) {
            return primeNumbers;
        }
        for(int i=2; i<number;i++) {
            if(number%i == 0) {
                primeNumbers.add(i);
                primeNumbers.addAll(generate(number/i));
                break;
            }
        }
        if(primeNumbers.isEmpty()) {
            primeNumbers.add(number);
        }
        return primeNumbers;
    }
}
