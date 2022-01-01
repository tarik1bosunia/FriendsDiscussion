package com.company.jtextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingActionListener extends JFrame {
    private Container c;
    private JTextField tf1, tf2;
    Font font, font2;

    private TextArea textArea;

    AddingActionListener(){

        initComponents();
    }
    private void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf1 = new JTextField();
        tf1.setBounds(10,10,500,50);
        tf1.setForeground(Color.BLUE);
        font = new Font("TaTa",Font.ITALIC,25);
        tf1.setFont(font);
        c.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(10,200,500,50);
        tf2.setForeground(Color.RED);
        font2 = new Font("Soma",Font.ITALIC,30);
        tf2.setFont(font2);

        c.add(tf2);

        textArea = new TextArea();
        textArea.setFont(font2);
        textArea.setBounds(10,10,300,200);

        setTitle("ActionListener");
        setBounds(10,10,1000,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

 /*       tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please write something");
                }else {
                    JOptionPane.showMessageDialog(null, "tf1 " + s);
                }
            }
        });
        tf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = tf2.getText();
                JOptionPane.showMessageDialog(null,"tf2 " + s);
            }
        });*/

        Handler handler  = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
    }
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s;
            if(e.getSource() == tf1){
                s = tf1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please write something");
                }else {
                    tf2.setText("Hello, " + s + "\nHow are you?");
                    tf2.setText("Hello, " + s + "\nWelcome");
                    JOptionPane.showMessageDialog(null, "Hello, " + s + "\nHow are you?");
                }
            }else if (e.getSource() == tf2){
                s = tf2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please write something");

                }else {

                    JOptionPane.showMessageDialog(null, "tf2 " + s);
                }
            }

        }

    }
    public static void main(String[] args) {
        AddingActionListener frame = new AddingActionListener();



    }
}


