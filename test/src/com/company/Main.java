package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main{
    public static void main(String args[]){

        JFrame f = new JFrame();
        Gameplay game=new Gameplay();
        f.getContentPane().add(game);
        f.setBounds(10,10,905,700);
        f.setBackground(Color.darkGray);//DARK_GRAY
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
