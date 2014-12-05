package com.github.silverbolt2014.price_tracker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PriceTracker {
    public static void main(String[] args){
        PriceTracker gui = new PriceTracker();
        gui.launch();
    }
    
    void launch(){
        JFrame frame = new JFrame();
        JPanel bottomPanel = new JPanel();
        JButton backButton = new JButton("Back");
        JButton nextButton = new JButton("Next");
        JButton updateButton = new JButton("Update");
        
        backButton.addActionListener(new BackButtonListener());
        nextButton.addActionListener(new NextButtonListener());
        updateButton.addActionListener(new UpdateButtonListener());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bottomPanel.add(backButton);
        bottomPanel.add(updateButton);
        bottomPanel.add(nextButton);
        
        
        frame.getContentPane().add(bottomPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        
        
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    class BackButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("The back button had an action");
        }
    }
    
    class NextButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("The next button had an action");
        }
    }

    class UpdateButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("The update button had an action");
        }
    }    
    
}