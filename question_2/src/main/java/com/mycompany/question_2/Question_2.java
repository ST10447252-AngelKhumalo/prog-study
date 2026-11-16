/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question_2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ingel
 */
public class Question_2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> {
        JFrame frame = new JFrame("Example JFrame");
        
        frame.setSize(400, 300);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLocationRelativeTo(null);
        
        frame.setLayout(new FlowLayout());
        
        frame.add(new JLabel("Hello, Swing!"));
        
        JButton Button = new JButton("Click Me");
        
        Button.addActionListener(e -> {
            new JLabel("Button Clicked");
        });
        
        frame.add(Button);
        
        frame.setVisible(true);
        
        });
    }
}
