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
    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.FindMaximumNumber(101.05f,21.50f, 51.10f);
        Assert.assertEquals((Float) 101.05f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.FindMaximumNumber(21.50f ,101.05f, 51.10f);
        Assert.assertEquals((Float) 101.05f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.FindMaximumNumber(51.10f ,21.50f, 101.05f);
        Assert.assertEquals((Float) 101.05f , maximumNumber);
    }
}
