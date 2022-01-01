package com.company.jtextfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextfield1 {

    public void func1(){
        JFrame frame = new JFrame("HaHa");

        Font font = new Font("Tata",Font.ITALIC + Font.BOLD,20);

        JTextField tf1 = new JTextField();
        tf1.setBounds(10,10,300,100);
        tf1.setFont(font);
        tf1.setForeground(Color.cyan);
        tf1.setBackground(Color.GREEN);
    //    tf1.setHorizontalAlignment(JTextField.RIGHT);
    //    tf1.setHorizontalAlignment(JTextField.CENTER);
       
        tf1.setHorizontalAlignment(JTextField.TRAILING);

        JTextField tf2 = new JTextField();
        tf2.setText("MD tarik bosunia");
        tf2.setBounds(10,120,100,100);


        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        c.add(tf1);
        c.add(tf2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setBounds(10,10,1000,800);
        frame.setVisible(true);


    }
    public void func2(){
        JFrame f= new JFrame("TextField Example");
        JTextField t1,t2;
        t1=new JTextField("Welcome to Javatpoint.");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("AWT Tutorial");
        t2.setBounds(50,150, 200,30);
        f.add(t1); f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        JTextfield1 jtf = new JTextfield1();
        jtf.func1();
    }
}



class JTextField2 implements ActionListener {
    JTextField tf1,tf2,tf3;
    JButton b1,b2;

   JTextField2(){
       JFrame f= new JFrame();
       tf1=new JTextField();
       tf1.setBounds(50,50,150,20);
       tf2=new JTextField();
       tf2.setBounds(50,100,150,20);
       tf3=new JTextField();
       tf3.setBounds(50,150,150,20);
       tf3.setEditable(false);
       b1=new JButton("+");
       b1.setBounds(50,200,50,50);
       b2=new JButton("-");
       b2.setBounds(120,200,50,50);
       b1.addActionListener(this);
       b2.addActionListener(this);
       f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);
       f.setSize(300,300);
       f.setLayout(null);
       f.setVisible(true);
   }
   public void actionPerformed(ActionEvent e){
       String s1 = tf1.getText();
       String s2 = tf2.getText();

       int a = Integer.parseInt(s1);
       int b = Integer.parseInt(s2);
       int c = 0;
       if(e.getSource() == b1){
           c = a + b;
       }else if(e.getSource() == b2){
           c = a -b;
       }
       String result = String.valueOf(c);
       tf3.setText(result);
   }

    public static void main(String[] args) {
        new JTextField2();
    }
}
