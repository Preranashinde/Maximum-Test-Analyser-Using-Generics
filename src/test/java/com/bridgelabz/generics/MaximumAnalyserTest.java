package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest {
    @Test
    public void GivenThreeIntegers_findMaximumAt_firstPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximumNumber(101 ,21, 51);
        Assert.assertEquals((Integer) 101 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximumNumber(21 ,101, 51);
        Assert.assertEquals((Integer) 101 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.FindMaximumNumber(21 ,51, 101);
        Assert.assertEquals((Integer) 101 , maximumNumber);
    }
}
