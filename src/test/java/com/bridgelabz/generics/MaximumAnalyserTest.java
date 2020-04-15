package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAnalyserTest {
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void GivenThreeIntegers_findMaximumAt_firstPosition_usingGenericClass() {
        Integer maximumNumber = (Integer) maximumAnalyser.findMaximumNumber(201,21,51,101);
        Assert.assertEquals((Integer) 201 , maximumNumber);
        System.out.println(maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_secondPosition_usingGenericClass() {
        Integer maximumNumber =(Integer) maximumAnalyser.findMaximumNumber(51 ,201,21,101);
        Assert.assertEquals((Integer) 201 , maximumNumber);
        System.out.println(maximumNumber);
    }
    @Test
    public void GivenThreeIntegers_findMaximumAt_thirdPosition_usingGenericClass() {
        Integer maximumNumber =(Integer) maximumAnalyser.findMaximumNumber(21 ,101, 201,51);
        Assert.assertEquals((Integer) 201 , maximumNumber);
        System.out.println(maximumNumber);
    }

    @Test
    public void GivenThreeFloat_findMaximumAt_firstPosition_shuldReturnSameNumber_usingGenericClass() {
        Float maximumNumber =(Float)maximumAnalyser.findMaximumNumber(201.51f,21.50f, 51.10f,101.05f);
        Assert.assertEquals((Float) 201.51f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_secondPosition_shuldReturnSameNumber_usingGenericClass() {
        Float maximumNumber =(Float)maximumAnalyser.findMaximumNumber(21.50f ,201.51f, 101.05f,51.10f);
        Assert.assertEquals((Float) 201.51f , maximumNumber);
    }
    @Test
    public void GivenThreeFloat_findMaximumAt_thirdPosition_shuldReturnSameNumber_usingGenericClass() {
        Float maximumNumber =(Float) maximumAnalyser.findMaximumNumber(51.10f ,101.051f,201.51f,21.50f);
        Assert.assertEquals((Float) 201.51f , maximumNumber);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_firstPosition_shuldReturnSameString_usingGenericClass() {
        String maximumString =(String) maximumAnalyser.findMaximumNumber( "Silver","Platinum","Gold","Iron");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_secondPosition_shuldReturnSameString_usingGenericClass() {
        String maximumString =(String) maximumAnalyser.findMaximumNumber("Gold","Silver","Platinum","Iron");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
    @Test
    public void GivenThreeStrings_findMaximumAt_thirdPosition_shuldReturnSameString_usingGenericClass() {
        String maximumString =(String) maximumAnalyser.findMaximumNumber("Iron","Gold","Silver","Platinum");
        Assert.assertEquals((String) "Silver" , maximumString);
    }
}
