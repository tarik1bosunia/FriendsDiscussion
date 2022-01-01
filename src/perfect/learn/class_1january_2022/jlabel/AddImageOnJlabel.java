package com.company.jlabel;

import javax.swing.*;
import java.awt.*;

public class AddImageOnJlabel extends JFrame{
    private Container container;
    private JLabel imageLabel;
    private ImageIcon icon;

    AddImageOnJlabel(){
        initComponent();
    }
    private void initComponent(){
        container = this.getContentPane();
        container.setLayout(null);
        container.setBackground(Color.MAGENTA);

        icon = new ImageIcon(getClass().getResource("/images/ssss.jpg"));

        imageLabel = new JLabel(icon);
        imageLabel.setBounds(50,30,icon.getIconWidth(),icon.getIconHeight());

        container.add(imageLabel);

    }

    public static void main(String[] args) {
        AddImageOnJlabel frame = new AddImageOnJlabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10,10,1000,800);
        frame.setTitle("JLabel");
    }
}
