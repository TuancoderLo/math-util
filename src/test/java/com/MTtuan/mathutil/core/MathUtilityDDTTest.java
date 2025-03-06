package com.MTtuan.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
        // chuẩn bị bộ data, các cặp data X! kì vọng bằng mấy
        // chính là mảng 2 chiều
        // hàm này phải là public static để các hàm @Test mò vào lấy data để test run
    public static Object[][] initData() {
        return new Object[][] {
                { 0, 1 },
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 5, 120 },
        };
    }

    @ParameterizedTest
    @MethodSource("initData") //
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}