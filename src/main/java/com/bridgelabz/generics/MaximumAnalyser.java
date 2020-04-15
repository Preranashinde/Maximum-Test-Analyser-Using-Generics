package com.bridgelabz.generics;

import java.util.Arrays;

public class MaximumAnalyser<K extends Comparable>  {
    K[] arrayElements;

    //Default Constructor
    public MaximumAnalyser() {
    }
    //Parameterized Constructor
        public  MaximumAnalyser(K[] arrayElements) {
            this.arrayElements=arrayElements;
    }
    public K findMaximumNumber(K...arrayElements)    {
        Arrays.sort(arrayElements);
        K maximumResult=arrayElements[arrayElements.length-1];
        printMax(maximumResult);
        return arrayElements[arrayElements.length-1];
    }
    private static <K> void printMax(K maximumResult) {
        System.out.println("Largest Among all is..."+maximumResult);
    }
}
