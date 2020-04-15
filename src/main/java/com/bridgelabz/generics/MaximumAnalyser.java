package com.bridgelabz.generics;

public class MaximumAnalyser {
    public <K extends Comparable<K>> K findMaximumNumber(K first, K second, K third)
    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
}
