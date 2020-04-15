package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest {
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void GivenThreeIntegers_findMaximumAt_firstPosition_usingGenericClass() {
        Integer maximumNumber = (Integer) maximumAnalyser.findMaximumNumber(201,101,21,51);
        Assert.assertEquals((Integer) 201 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition_usingGenericClass() {
        Integer maximumNumber =(Integer) maximumAnalyser.findMaximumNumber(21 ,201,101, 51);
        Assert.assertEquals((Integer) 201 , maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximumNumber =(Integer) maximumAnalyser.findMaximumNumber(21 ,51, 201,101);
        Assert.assertEquals((Integer) 201 , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber =(Float)maximumAnalyser.findMaximumNumber(201.51f,101.05f,21.50f, 51.10f);
        Assert.assertEquals((Float) 201.51f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_secondPosition_shuldReturnSameNumber_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber =(Float)maximumAnalyser.findMaximumNumber(21.50f ,201.51f,101.05f, 51.10f);
        Assert.assertEquals((Float) 201.51f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_thirdPosition_shuldReturnSameNumber_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Float maximumNumber =(Float) maximumAnalyser.findMaximumNumber(51.10f ,21.50f,201.51f,101.05f);
        Assert.assertEquals((Float) 201.51f , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_firstPosition_shuldReturnSameString_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        String maximumString =(String) maximumAnalyser.findMaximumNumber("Platinum", "Silver" , "Gold" , "Iron");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_secondPosition_shuldReturnSameString_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        String maximumString =(String) maximumAnalyser.findMaximumNumber("Gold","Platinum","Silver" ,"Iron");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_thirdPosition_shuldReturnSameString_usingGenericClass() {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        String maximumString =(String) maximumAnalyser.findMaximumNumber("Iron" ,"Gold", "Platinum","Silver");
        Assert.assertEquals((String) "Silver" , maximumString);
    }

}
