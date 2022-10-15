/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pos;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Kent
 */
public class POS {

    public static void main(String[] args) {
        JFrame frame = new JFrame();//creating instance of JFrame
        frame.setSize(400,600);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible  
        frame.setResizable(false);
        
        JButton cashier=new JButton("Cashier");//creating instance of JButton  
        cashier.setBounds(130,200,100, 40);//x axis, y axis, width, height  
        frame.add(cashier);//adding button in JFrame  
        
        JButton admin=new JButton("Admin");//creating instance of JButton  
        admin.setBounds(130,300,100, 40);//x axis, y axis, width, height  
        frame.add(admin);//adding button in JFrame  
        
        Login login = new Login();
        
        cashier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setLayout(null);//using no layout managers  
                login.setVisible(true);//making the frame visible  
                frame.setVisible(false);
            }
        });
        
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Admin");
            }
        });
        
        DBClass.getkoneksi();
    }
}


