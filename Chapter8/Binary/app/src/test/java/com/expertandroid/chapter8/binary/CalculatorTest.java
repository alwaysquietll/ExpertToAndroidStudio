package com.expertandroid.chapter8.binary;

import com.expertandroid.chapter8.binary.logic.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void initializeCalculator(){
        calculator=new Calculator();
    }

    @Test
    public void convertToBinarySuccess() throws Exception {
        assertThat(calculator.convertToBinary("256"), is("100000000"));
    }

    @Test
    public void convertToBinaryFail() throws Exception {
        assertThat(calculator.convertToBinary("12ww11"), is("Invalid input"));
    }

    @Test
    public void convertToDecimaSuccess() throws Exception {
        assertThat(calculator.convertrToDecimal("1111"), is("15"));
    }

    @Test
    public void convertToDecimaFail() throws Exception {
        assertThat(calculator.convertrToDecimal("121"), is("Invalid input"));
    }
}