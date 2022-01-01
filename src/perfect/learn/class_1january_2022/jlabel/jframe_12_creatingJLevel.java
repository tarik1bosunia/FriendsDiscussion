package com.company.jlabel;

import javax.swing.*;
import java.awt.*;

class LabelDemo extends JFrame {
    private ImageIcon icon;
    private Container container;
    private JLabel userLabel,passLabel;
    private Font font1,font2;

    LabelDemo(){

        initComponents();
    }
    public void initComponents(){
        icon = new ImageIcon(getClass().getResource("/images/ssss.jpg"));
        this.setIconImage(icon.getImage());


        container = this.getContentPane();
        container.setBackground(Color.CYAN);
        container.setLayout(null);
        container.setBackground(Color.GREEN);

        font1 = new Font("Arial",Font.BOLD,20);
        font2 = new Font("Sarif",Font.ITALIC,30);

        userLabel = new JLabel();
        userLabel.setText("Enter Your USerName");
        userLabel.setBounds(50,100,300,100);
        userLabel.setFont(font1);
        userLabel.setForeground(Color.CYAN);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.black);
        userLabel.setToolTipText("Haha i am tarik...");
        container.add(userLabel);

        System.out.println(userLabel.getText());
        System.out.println(userLabel.getToolTipText());


        passLabel = new JLabel("Enter your password");
        passLabel.setBounds(50,220,200,100);
        passLabel.setFont(font2);

        container.add(passLabel);

    }

}

public class jframe_12_creatingJLevel {
    public static void main(String[] args) {
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,800);
        frame.setTitle("JLabel");

    }
}
