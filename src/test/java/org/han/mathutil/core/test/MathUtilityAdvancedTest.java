/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.han.mathutil.core.test;

import org.han.mathutil.core.Mathutility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author 84354
 */
//Chuẩn bị sẵn  riêng test data lát hồi fill vào hàm
//DDT
//
public class MathUtilityAdvancedTest {
    //Hàm trả về mảng 2 chiều kiểu wrapper class/object
    //mảng chứa các cặp n-->expected vis dụ 0! -> 1; 1! -> 1
    public static Object[][] initTestData(){
        Object[][] testData = {{0,1}, 
                                         {1,1}, 
                                         {2,2}, 
                                         {5,120}
                                        };
        return testData;
    }
    @ParameterizedTest
    @MethodSource(value = "initTestData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected){
        //tham số hóa việc đưa test data vào hàm assertE()
        //biến đổi dữ liệu thành tham số cho tổng quát
        //PARAMETERized
        
       assertEquals(expected, Mathutility.getFactorial(n));
       
   }
    
}
// TDD vs DDT
//TDD- test driver development
//Là kĩ thuật viết code chính, đan xen cùng với viết test case /test script
//Script, tức là quá trình viết cide làm app ta viết luôn nhug74 đoạn code (dùng thư viện unit Test như Junit,TestNG,xUnit, MSTest..)
//dùng để test hàm ta vừa viết
//Viết code và viết cide test cùng nhau thì gọi là kĩ thuật lập trình hướng về kiểm thử -TDD

//DDT - Data driven testing
//là kĩ thuật bổ trợ mở rộng them cho kĩ thuật TDD
//là kĩ thuật viết test code mà ta tách riêng những bộ data test ra  1 chỗ ,câu lệnh so sanh ra 1 chỗ
//Kết nối ,map/fill vào 2 biến n ,excepted và lát hồi 2 biến này được fill vào tiếp cái hàm assertEquals(excepted,getF(N))
//DDT
//còn được gọi là 1 tên khác là PARAMEterized testing
//Kĩ thuật kiểm thử code mà hướng về tham số hóa các data test
