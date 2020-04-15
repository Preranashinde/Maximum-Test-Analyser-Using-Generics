package com.bridgelabz.generics;

import java.util.Arrays;

public class MaximumAnalyser<K extends Comparable<K>>  {
    private K first;
    private K second;
    private K third;
    K[] arrayElements;

    //Default Constructor
    public MaximumAnalyser() {
    }
    //Parameterized Constructor
        public  MaximumAnalyser(K[] array) {
            this.arrayElements=array;
    }
    public K findMaximumNumber(K...arrayElements)    {
        Arrays.sort(arrayElements);
        return arrayElements[arrayElements.length-1];
    }
    public <K extends Comparable<K>> K findMaximum(){
        return (K) findMaximumNumber(arrayElements);
    }
}
