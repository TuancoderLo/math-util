package com.MTtuan;

import com.MTtuan.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0ReturnsWell();
        testFactorialGivenWrongArgumentMinus1ThrowsException();
    }

    //Hàm kiểm thử code chính của mình
    public static void testFactorialGivenRightArgument0ReturnsWell() {
        int n = 0;
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(n);

//        System.out.println("Expected: " + expectedResult + " Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult);
        //so sánh xem 2 đứa expected == actual không ?? nhưng không viết sout()
        //hàm này của class thư viện JUnit

    }

    public static void testFactorialGivenWrongArgumentMinus1ThrowsException() {
        long actualResult = MathUtility.getFactorial(- 1);
        //Chạy hàm này, thấy ngoại lệ bung ra, mừng rơi nước mắt
        //Vì đưa -1 mà hàm ném ngoại lệ nghĩa là hàm chạy đúng do data cà chớn
        //Hàm được thiết kế là n âm thì ném ngoại lệ
        //Vậy giờ nếu đưa -1 mà ném ngoại lệ thì đúng
    }

    //Dân dev phải test code của chính họ
    //Họ test như thế nào?
    //Trước khi test (test run) thì cần có test case

    //Test case #1
    //Check getFactorial() with n = 0
    //Steps:
    //n = 0;
    //Call getFactorial(0)
    //Expected result/value: 1

    //Test case #2
    //Check getFactorial() with n = 1
    //Steps:
    //n = 1
    //Call getFactorial(1)
    //Expected result/value: 1

    //Test case #3
    //Check getFactorial() with n = 5
    //Steps:
    //n = 5;
    //Call getFactorial(5)
    //Expected result/value: 120

    //Test case #4
    //Check getFactorial() with n = -1
    //Steps:
    //Given n = 1;
    //Call getFactorial(-1)
    //Expected result/value: An exception is thrown

    //Test case #5
    //Check getFactorial() with n = 21
    //Steps:
    //Given n = 21;
    //Call getFactorial(21)
    //Expected result/value: An exception is thrown
}