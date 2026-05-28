import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculator {
    int windowWidth = 500;
    int windowHeight = 700;

    
    Color lightGray =new Color(212,212,210);
    Color darkGray =new Color(80,80,80);
    

    JFrame calFrame = new JFrame("calculator ");

    //Pop up window size and controls//
    Calculator(){
        calFrame.setVisible(true);
        calFrame.setSize(windowWidth, windowHeight);
        calFrame.setLocation(null);
        calFrame.setResizable(false);
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.setLayout(new BorderLayout());

    }



}
