package com.MTtuan.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.MTtuan.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

//import static là cách khai báo trước tên class chứa hàm static
// để ở dươới gọi



class MathUtilityTest {
    //Class này xài bộ thư viện JUNIT, được tải trên mạng về tự động bởi maven.
    //Bộ thư viên JUNIT này dùng để test tự động các hàm của class chính
    //Nó sẽ tự chạy khi đóng gói app, để check xem các hàm có chạy đúng không
    //Đúng tức là expected == actual
    //Nếu có nhiều test case, thì nó sẽ gom status của các test case lại
    //thành 2 màu xanh đỏ, mắt dev chỉ cần nhìn 2 màu xanh - passed, đỏ failed
    //mà không cần nhìn từng test case coi passed hay failed
    //Y chang cho các ngôn ngữ lập trình khác - là chuẩn test code rồi

    //Bộ thư viện này còn gọi là framework JUNIT testing framework
    @Test
    void testFactorialGivenRightArgument0ReturnsWell() {
        assertEquals(1, getFactorial(0));
    }

    @Test
    void testFactorialGivenRightArgument1ReturnsWell() {
        assertEquals(1, getFactorial(1));
        // 1! hi vọng trả về 1
        // Assert là hàm so 2 giá trị đó có == nhau không của thư viên JUNIT
    }

    @Test
    void testFactorialGivenRightArgument4ReturnsWell() {
        assertEquals(24, getFactorial(4));
    }

    @Test
    void testFactorialGivenRightArgument5ReturnsWell() {
        assertEquals(120, getFactorial(5));
    }
}