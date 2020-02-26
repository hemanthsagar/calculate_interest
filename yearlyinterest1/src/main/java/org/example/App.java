package org.example;

/**
 * project created by pothulapalli hemanth sagar
 *
 */
public class App extends Thread
{
    public void run()
    {
        //System.out.print("hi");
        creategui a=new creategui();
        a.createguifunction();
    }
    public static void main(String args[])
    {
        App t1=new App();
        t1.start();
    }
}
