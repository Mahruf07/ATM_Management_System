package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    JTextField input;
    JButton deposit,back;
    String pinNumber;

    Deposit(String pin){
        setLayout(null);
        this.pinNumber = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(770,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 700);
        add(image);

        JLabel text = new JLabel("Enter your deposit amount");
        text.setBounds(190,260,400,30);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setForeground(Color.white);
        image.add(text);

        input = new JTextField();
        input.setBounds(138,300,300,30);
        image.add(input);

        deposit = new JButton("Deposit");
        deposit.setBounds(320,420,120,30);
        deposit.setFont(new Font("System",Font.BOLD,16));
        deposit.addActionListener(this);
        deposit.setBackground(new Color(5, 169, 92));
        deposit.setForeground(Color.white);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(320,460,120,30);
        back.setFont(new Font("System",Font.BOLD,16));
        back.addActionListener(this);
        back.setBackground(new Color(5, 169, 92));
        back.setForeground(Color.white);
        image.add(back);


        setSize(770,850);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        try {
            String amount = input.getText();
            Date date = new Date();
            if (ae.getSource() == deposit){
                if (input.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to Deposit");
                }else {
                    Conn connection = new Conn();
                    
                }
            } else if (ae.getSource() == back) {
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
