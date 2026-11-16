/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progstudy;

import javax.swing.JOptionPane;


/**
 *
 * @author ingel
 */
public class ProgStudy {

    public static void main(String[] args) {
        int[] years = {1,2};
        
        int[][] quaters = {
            {300, 150, 700}, 
            {250, 200,600}
        };
        
        for (int row = 0; row < years.length; row++) {
            System.out.println("Year " + years[row] + ":");
            for (int col=0; col < quaters[row].length; col++){
                System.out.println("Quater: " +(col + 1) + ":" + quaters[row][col]);
            }
        }
         
         
    }
}
