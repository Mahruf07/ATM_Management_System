package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    JButton deposit,withdraw,fastCash,miniStatement,pinChange,balanceInquiry,exit;
    String pinNumber;
    Transactions(String pin){
        this.pinNumber = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(770,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 700);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(180,180,700,35);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.white);
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(140,370,130,30);
        deposit.addActionListener(this);
        deposit.setBackground(new Color(5, 169, 92));
        deposit.setForeground(Color.white);
        image.add(deposit);

        withdraw = new JButton("Cash Withdraw");
        withdraw.setBounds(290,370,130,30);
        withdraw.addActionListener(this);
        withdraw.setBackground(new Color(5, 169, 92));
        withdraw.setForeground(Color.white);
        image.add(withdraw);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(140,405,130,30);
        fastCash.addActionListener(this);
        fastCash.setBackground(new Color(5, 169, 92));
        fastCash.setForeground(Color.white);
        image.add(fastCash);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(290,405,130,30);
        miniStatement.addActionListener(this);
        miniStatement.setBackground(new Color(5, 169, 92));
        miniStatement.setForeground(Color.white);
        image.add(miniStatement);

        pinChange = new JButton("Pin Change");
        pinChange.setBounds(140,440,130,30);
        pinChange.addActionListener(this);
        pinChange.setBackground(new Color(5, 169, 92));
        pinChange.setForeground(Color.white);
        image.add(pinChange);

        balanceInquiry = new JButton("Balance Inquiry");
        balanceInquiry.setBounds(290,440,130,30);
        balanceInquiry.addActionListener(this);
        balanceInquiry.setBackground(new Color(5, 169, 92));
        balanceInquiry.setForeground(Color.white);
        image.add(balanceInquiry);

        exit = new JButton("Exit");
        exit.setBounds(290,475,130,30);
        exit.addActionListener(this);
        exit.setBackground(new Color(5, 169, 92));
        exit.setForeground(Color.white);
        image.add(exit);


        setSize(770,850);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == exit){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Transactions("");
    }
}
