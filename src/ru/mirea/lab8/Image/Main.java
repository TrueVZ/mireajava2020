package ru.mirea.lab8.Image;

import javax.swing.*;


public class Main extends JFrame {
    public Main(String[] args){
        super("Task 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        ImageComp img = new ImageComp(args[0]);
        add(img);
        getContentPane().validate();
        getContentPane().repaint();
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main(args);
    }


}
