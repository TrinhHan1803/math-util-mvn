/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.han.mathutil.core.test;

import org.han.mathutil.core.Mathutility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 84354
 */
public class MathUtilityTest {
    
   @Test
   public void checkFactorialGivenRightArgumentReturnsWell(){
       assertEquals(1, Mathutility.getFactorial(0));
       assertEquals(1, Mathutility.getFactorial(1));
       assertEquals(2, Mathutility.getFactorial(2));
       assertEquals(6, Mathutility.getFactorial(3));
       assertEquals(120, Mathutility.getFactorial(5));
   }
    
}
//TDD: Test driven development

