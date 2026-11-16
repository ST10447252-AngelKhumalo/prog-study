/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progstudy;

/**
 *
 * @author ingel
 */
public class ProductSales implements IProduct {

    private int[] years;
    private int[][] productSales;

    public ProductSales(int[] years, int[][] productSales) {
        this.years = years;
        this.productSales = productSales;
    }

    
    
    public ProductSales(){
        
    }

    public int[] getYears() {
        return years;
    }

    public void setYears(int[] years) {
        this.years = years;
    }

    public int[][] getProductSales() {
        return productSales;
    }

    public void setProductSales(int[][] productSales) {
        this.productSales = productSales;
    }

    
    
    @Override
    public int TotalSales(int[][] productSales){
        int total = 0;
        for (int row= 0; row < productSales.length; row++){
            for (int col = 0; col < productSales[row].length; col++){
                total += productSales[row][col];
            }
        }
        return total;
    }
    
    @Override
    public double AverageSales(int[][] productSales){
        int count = 0;
        for (int row = 0; row < productSales.length; row++){
            count += productSales[row].length;
        }
        return count > 0 ? (double) TotalSales(productSales) / count: 0.0;
        
    }
    
//    @Override
//    public int MaxSale(int[][] productSales){
//        int max = productSales;
//        
//    }
//    

    @Override
    public int MaxSale(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int MinSale(int[][] productSales) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
