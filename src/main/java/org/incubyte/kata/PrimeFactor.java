package org.incubyte.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactor {
    public static List<Integer> generate(int integer) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (integer == 1) {
            return primeNumbers;
        }
//        primeNumbers.add(integer);
        int squareRoot = (int) Math.sqrt(integer);
        for(int i=2; i<=squareRoot;i++) {
            if(integer%i == 0) {
                primeNumbers.add(i);
                primeNumbers.add(integer/i);
            }
        }
         Collections.sort(primeNumbers);
        return primeNumbers;
    }
}
