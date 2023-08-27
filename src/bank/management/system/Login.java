package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    public JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm_card.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(50,20,100,100);
        add(label);

        JLabel text = new JLabel("Welcome to the ATM");
        text.setBounds(200,50,400,40);
        text.setFont(new Font("Courier",Font.BOLD,35));
        add(text);

        JLabel cardno = new JLabel("Card Number: ");
        cardno.setBounds(120,150,200,40);
        cardno.setFont(new Font("Rale way",Font.BOLD,25));
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(350,150,250,40);
        add(cardTextField);

        JLabel pin = new JLabel("Pin: ");
        pin.setBounds(120,200,200,40);
        pin.setFont(new Font("Rale way",Font.BOLD,25));
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350,200,250,40);
        add(pinTextField);

        login = new JButton("Login");
        login.setBounds(350,250,120,40);
        login.addActionListener(this);
        Color backgroundColor = new Color(36, 160, 237);
        login.setBackground(backgroundColor);
        login.setForeground(Color.white);
        add(login);

        clear = new JButton("Clear");
        clear.setBounds(480,250,120,40);
        clear.addActionListener(this);
        clear.setBackground(backgroundColor);
        clear.setForeground(Color.white);
        add(clear);

        signup = new JButton("Sign Up");
        signup.setBounds(350,300,250,40);
        signup.addActionListener(this);
        signup.setBackground(backgroundColor);
        signup.setForeground(Color.white);
        add(signup);

        getContentPane().setBackground(Color.white);

        setSize(800,480);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }

    }

    public static void main(String[] args) {
        new Login();
    }


}
