//package ru.mirea.lab12;
//
//
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Random;
//
//public class Main extends JFrame {
//
//    private static final Random random = new Random();
//    public static final int width = 800;
//    public static final int height = 600;
//    private static final int secret = random.nextInt(19) + 1;
//    private static int count = 0;
//    public Main(){
//        super("Task 1");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setDefaultLookAndFeelDecorated(true);
//        JButton btn = new JButton("Click");
//        btn.setBounds(10, 10, 100, 50);
//        JTextField minField = new JTextField("Number", 25);
//        String[] planetString = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Nepture"};
//        JComboBox planetList =new JComboBox(planetString);
//        JPanel pane = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                planetList.get
//            }
//        });
//        pane.add(minField);
//        pane.add(btn);
//        pane.add(planetList);
//        setContentPane(pane);
//        setSize(width, height);
//        setVisible(true);
//        System.out.println(secret);
//    }
//
//    public static void main(String[] args) {
//        new Main();
//    }
//}

