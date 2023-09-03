package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupThree extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;

    SignupThree(){
        setLayout(null);
        l1 = new JLabel("Form Number: " + SignupOne.random);
        l1.setFont(new Font("Rale way", Font.BOLD, 35));
        l1.setBounds(220,20,400,40);
        add(l1);

        l2 = new JLabel("Page-3 : Account Details");
        l2.setFont(new Font("Rale way", Font.BOLD, 22));
        l2.setBounds(250,70,300,40);
        add(l2);

        l3 = new JLabel("Account Type");
        l3.setFont(new Font("Rale way", Font.BOLD, 22));
        l3.setBounds(250,70,300,40);
        add(l3);

        l3 = new JLabel("Card Number");
        l3.setFont(new Font("Rale way", Font.BOLD, 22));
        l3.setBounds(250,70,300,40);
        add(l3);




        setSize(800,780);
        setLocation(450,70);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){

    }

    public static void main(String[] args) {
        new SignupThree();
    }

}
