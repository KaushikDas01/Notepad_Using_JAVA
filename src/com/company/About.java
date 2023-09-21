package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {
    About(){
        setBounds(400,100,600,500);
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("com/company/icons/windows.png"));
        Image i2= i1.getImage().getScaledInstance(300,60,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel headericon= new JLabel(i3);
        headericon.setBounds(70,40,400,80);
        add(headericon);

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("com/company/icons/notepad.png"));
        Image i5= i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel icon= new JLabel(i6);
        icon.setBounds(50,190,70,70);
        add(icon);

        JLabel text= new JLabel("<html><b>Made by KAUSHIK DAS</b><br> Version 0.1.0 (OS Build JAVA)<br> <b>[This is a practice project using JAVA only]</b><br>All rights reserved</html>");
        text.setBounds(160,90,500,300);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN,16));
        add(text);

        JButton b1= new JButton("OK");
        b1.setBounds(150,350,120,25);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);


    }
    public static void main(String[] args) {
        new About();
    }


}
