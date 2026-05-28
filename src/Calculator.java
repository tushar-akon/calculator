import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class Calculator {
    int windowWidth = 500;
    int windowHeight = 700;

    //colors used in this app//
    Color lightGray =new Color(212,212,210);
    Color darkGray =new Color(80,80,80);
    Color Black = new Color(28,28,28);
    Color orange = new Color(255,149,0);

    

    JFrame calFrame = new JFrame("Lets Do Some Math ");
    JLabel displayLabel= new JLabel();
    JPanel displayPanel = new JPanel();



    //Pop up window size and controls//
    Calculator(){
        calFrame.setVisible(true);
        calFrame.setSize(windowWidth, windowHeight);
        calFrame.setLocation(null);
        calFrame.setResizable(false);
        calFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calFrame.setLayout(new BorderLayout());

        displayLabel.setBackground(Black);
        displayLabel.setForeground(Color.white);
        displayLabel.setFont(new Font("Arial",Font.PLAIN,80));
        displayLabel.setHorizontalAlignment(JLabel.RIGHT);
        displayLabel.setText("0");
        displayLabel.setOpaque(true);


        displayPanel.setLayout(new BorderLayout());
        displayPanel.add(displayPanel);
        




    }



}
