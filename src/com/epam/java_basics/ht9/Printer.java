package com.epam.java_basics.ht9;

import java.util.Arrays;

public class Printer {
    public void print(Object... pieceOfData) {
        Arrays.stream(pieceOfData).forEach(System.out::println);
    }
}
