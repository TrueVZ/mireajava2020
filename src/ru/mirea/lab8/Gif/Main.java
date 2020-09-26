package ru.mirea.lab8.Gif;

import ru.mirea.lab8.Image.ImageComp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {


    private static String path = "/Users/valyazaikin/IdeaProjects/mirea/src/ru/mirea/lab8/Image/";
    String[] imgs = {"Mirea1.png", "MIREA.png"};
    private static String filepath = "/Users/valyazaikin/IdeaProjects/mirea/src/ru/mirea/lab8/Image/MIREA.png";
    JFrame frame;
    public Main(){
        frame = new JFrame("Task 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(800, 600);
        frame.add(new ImgPanel());
        frame.pack();
        frame.setVisible(true);
        gif();

    }
    public void gif(){
        int i = 0;
        while (true){
            filepath = path + imgs[i];
            i = (i + 1) % 2;
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (Exception exc) {
                exc.printStackTrace();
            }
            frame.repaint();
        }
    }

    public class ImgPanel extends JPanel{
        private Image img;

        public void paintComponent(Graphics g){
            Graphics2D g2d = (Graphics2D) g;
            try{
                img = ImageIO.read(new File(filepath));
            } catch (IOException e){
                e.printStackTrace();
            }
            g2d.drawImage(img, 50, 50, this);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
