package org.example;
/**
 * project created by pothulapalli hemanth sagar
 *
 */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class creategui
{
    //{
    static Button submit;
    static int p1,t1,r1;
    static String s1,s2,s3;
    static Frame f;
    static Panel p;
    static TextField tf1,tf2,tf3;
    static GridLayout g;
    //}

    public static void createguifunction()
    {

        JLabel l1=new JLabel("Principle amount");
        JLabel l2=new JLabel("Time");
        JLabel l3=new JLabel("Rate of Interest");


        f = new Frame("My calculator");
        p = new Panel();
        f.setLayout(new GridLayout(6,6));
        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);

        submit=new Button("submit");
        submit.addActionListener(Mediator1.getInstance());
        g = new GridLayout(6,2);
        p.setLayout(g);
        p.add(l1);
        p.add(tf1);
        p.add(l2);
        p.add(tf2);
        p.add(l3);
        p.add(tf3);
        p.add(submit);
        f.add(p);
        f.setSize(300,800);
        f.setVisible(true);

    }
    public static TextField getTextField1()
    {
        return tf1;
    }
    public static TextField getTextField2()
    {
        return tf2;
    }
    public static TextField getTextField3()
    {
        return tf3;
    }
    public static Button getsbutton()
    {
        return submit;
    }
}