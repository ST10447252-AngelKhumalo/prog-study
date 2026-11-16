/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progstudy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ingel
 */
public class ProductSalesTest {
    
//    Question 1.3
  @Test
  public void CalculateTotalSales_ReturnsTotalSales(){
      int[] years = {1,2};
      int[][] totalSales = {
          {1300, 200, 4000},
          {300, 200, 400}
      };
      
     
     ProductSales productSale = new ProductSales( years, totalSales);
     
     int expectedTotal = 6400;
     int actualTotal = productSale.TotalSales(totalSales);
     
     assertEquals(expectedTotal, actualTotal, "total sales should equal 6400");
     
       
  } 
    
}
