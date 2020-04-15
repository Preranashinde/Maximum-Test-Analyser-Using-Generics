package com.bridgelabz.generics;

public class MaximumAnalyser<K extends Comparable<K>>  {
    private K first;
    private K second;
    private K third;

    //Default Constructor
    public MaximumAnalyser() {
    }
    //Parameterized Constructor
    public MaximumAnalyser(K first, K second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public K findMaximumNumber(K first, K second, K third)    {
        if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
            return first;
        else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
            return second;
        else
            return third;
    }
    public <T extends Comparable<T>> T findMaximum(){
        return (T) findMaximumNumber(first, second, third);
    }
}
