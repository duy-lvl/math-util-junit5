/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.duylvl.mathutil.core;

import static com.duylvl.mathutil.core.MathUtil.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author DuyLVL
 */
public class MathUtilTest {

    public static Object[][] initData() {
        return new Integer[][]{
            //{input, expected}
            {1, 1}, {2, 2}, {5, 120}, {6, 720}
        };
    }

    @ParameterizedTest
    @MethodSource(value = "initData") //tên hàm cung câp data, ngâm dinh thú t
    public void testGetFactorialGivenRightArgumentReturnsWell(int input, long expected) {
        assertEquals(expected, getFactorial(input));
    }

//    @Test
//    public void testGetFactorialGivenRightArgumentReturnsWell() {
//        assertEquals(120, getFactorial(5));
//    }
    //@Test(expected = ExceptionName.class)
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException() {
//        Executable exceptionObject = () -> {
//            getFactorial(-5);
//        };

//        assertThrows(IllegalArgumentException.class, exceptionObject);
        assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
    }
}
