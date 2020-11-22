package ru.mirea.lab24.task3;

import ru.mirea.lab24.task3.document.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {




    public static void app(){
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenu newMenu = new JMenu("New");

        JMenuItem textItemNew = new JMenuItem("Text");
        JMenuItem imageItemNew = new JMenuItem("Image");
        JMenuItem musicItemNew = new JMenuItem("Music");




        textItemNew.addActionListener(e -> {
            CreateDocument createDocument = new CreateTextDocument();
            IDocument document = createDocument.createNew();
            document.new_file();

        });
        imageItemNew.addActionListener(e -> {
            CreateDocument createDocument = new CreateImageDocument();
            IDocument document = createDocument.createNew();
            document.new_file();
        });
        musicItemNew.addActionListener(e -> {
            CreateDocument createDocument = new CreateMusicDocument();
            IDocument document = createDocument.createNew();
            document.new_file();

        });



        newMenu.add(textItemNew);
        newMenu.add(imageItemNew);
        newMenu.add(musicItemNew);

        jMenuBar.add(newMenu);
        jMenuBar.setBackground(Color.WHITE);

        frame.setJMenuBar(jMenuBar);
        frame.setPreferredSize(new Dimension(200, 100));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(Application::app);
    }
}
