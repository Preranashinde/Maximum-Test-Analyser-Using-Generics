package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest {
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void GivenThreeIntegers_findMaximumAt_firstPosition() {
        Integer maximumNumber = maximumAnalyser.findMaximumNumber(101,21,51);
        Assert.assertEquals((Integer) 101 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition() {
        Integer maximumNumber = maximumAnalyser.findMaximumNumber(21 ,101, 51);
        Assert.assertEquals((Integer) 101 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber = maximumAnalyser.findMaximumNumber(21 ,51, 101);
        Assert.assertEquals((Integer) 101 , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.findMaximumNumber(101.05f,21.50f, 51.10f);
        Assert.assertEquals((Float) 101.05f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_secondPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.findMaximumNumber(21.50f ,101.05f, 51.10f);
        Assert.assertEquals((Float) 101.05f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_thirdPosition_shuldReturnSameNumber() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber = maximumAnalyser.findMaximumNumber(51.10f ,21.50f, 101.05f);
        Assert.assertEquals((Float) 101.05f , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_firstPosition_shuldReturnSameString() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        String maximumString = maximumAnalyser.findMaximumNumber("Silver" , "Gold" , "Iron");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_secondPosition_shuldReturnSameString() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        String maximumString = maximumAnalyser.findMaximumNumber("Gold","Silver" ,"Iron");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_thirdPosition_shuldReturnSameString() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        String maximumString = maximumAnalyser.findMaximumNumber("Iron" ,"Gold", "Silver");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
}
