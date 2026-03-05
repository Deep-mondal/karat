package com.deep.testservices;

import com.deep.calculator.CalculatorMS;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorMSTest {

    @Test
    public void addTest(){
        int res=CalculatorMS.add(12,10);
        int expected=22;
        Assert.assertEquals(res,expected);
    }
}
