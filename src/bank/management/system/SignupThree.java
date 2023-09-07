package bank.management.system;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5, l6,l7,l8,l9,l10,l11,l12;
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
        l3.setFont(new Font("Rale way", Font.BOLD, 18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Rale way",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account(FDR)");
        r2.setFont(new Font("Rale way",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Rale way",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Rale way",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(r1);
        accountGroup.add(r2);
        accountGroup.add(r3);
        accountGroup.add(r4);

        l3 = new JLabel("Card Number");
        l3.setFont(new Font("Rale way", Font.BOLD, 22));
        l3.setBounds(100,300,200,30);
        add(l3);

        l4 = new JLabel("XXXX-XXX-XXX-4018");
        l4.setFont(new Font("Rale way", Font.BOLD, 18));
        l4.setBounds(330,300,300,30);
        add(l4);

        l5 = new JLabel("Your 16 digit card number");
        l5.setFont(new Font("Rale way", Font.BOLD, 12));
        l5.setBounds(330,320,300,20);
        add(l5);

        l6 = new JLabel("PIN");
        l6.setFont(new Font("Rale way", Font.BOLD, 22));
        l6.setBounds(100,350,200,30);
        add(l6);

        l7 = new JLabel("XXXX");
        l7.setFont(new Font("Rale way", Font.BOLD, 18));
        l7.setBounds(330,350,300,30);
        add(l7);

        l8 = new JLabel("Your 4 digit password");
        l8.setFont(new Font("Rale way", Font.BOLD, 12));
        l8.setBounds(330,370,300,20);
        add(l8);

        l9 = new JLabel("Services Required: ");
        l9.setFont(new Font("Rale way", Font.BOLD, 22));
        l9.setBounds(100,430,300,30);
        add(l9);

        c1 = new JCheckBox("Debit Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Rale way",Font.BOLD,14));
        c1.setBounds(100,470,200,20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Rale way",Font.BOLD,14));
        c2.setBounds(350,470,200,20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Rale way",Font.BOLD,14));
        c3.setBounds(100,500,200,20);
        add(c3);

        c4 = new JCheckBox("Email Alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Rale way",Font.BOLD,14));
        c4.setBounds(350,500,200,20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Rale way",Font.BOLD,14));
        c5.setBounds(100,530,200,20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Rale way",Font.BOLD,14));
        c6.setBounds(350,530,200,20);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are accurate.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Rale way",Font.BOLD,14));
        c7.setBounds(100,570,500,20);
        add(c7);

        b1 = new JButton("Submit");
        b1.addActionListener(this);
        b1.setBackground(Color.WHITE);
        b1.setBackground(new Color(36, 160, 237));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Rale way",Font.BOLD,14));
        b1.setBounds(230,630,100,30);
        add(b1);

        b2 = new JButton("Cancel");
        b2.addActionListener(this);
        b2.setBackground(Color.WHITE);
        b2.setBackground(new Color(36, 160, 237));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Rale way",Font.BOLD,14));
        b2.setBounds(400,630,100,30);
        add(b2);

        setSize(750,730);
        setLocation(450,70);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){
        String formNo = ""+SignupOne.random;
 //       String formNo = "2126";

        if (ae.getSource() == b1){
            String accountType = null;
            if (r1.isSelected()){
                accountType = "Savings Account";
            }else if (r2.isSelected()){
                accountType = "Fixed Deposit Account(FDR)";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            }else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }

            Random ran = new Random();
            long rand = ((ran.nextLong() % 90000000) + 5094093600000000L);
            String cardNo = "" + Math.abs(rand);

            int randPin = (ran.nextInt() % 9000) + 1000;
            String pin = "" + randPin;

            String services = "";
            if (c1.isSelected()){
                services = "" + " ATM Card";
            }else if (c2.isSelected()){
                services = services + " Internet Banking";
            }else if (c3.isSelected()){
                services = services + " Mobile Banking";
            }else if (c4.isSelected()){
                services = services + " Email Alert";
            }else if (c5.isSelected()){
                services = services + " Cheque Book";
            }else if (c6.isSelected()){
                services = services + " E-Statement";
            }

            try{
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else {
                    Conn connection = new Conn();
                    String query1 = "INSERT INTO account_information (form_number, account_type, cardNo, pin, services) " +
                            "VALUES ('" + formNo + "', '" + accountType + "', '" + cardNo + "', '" + pin + "', '" + services + "')";
                    String query2 = "INSERT INTO login_info (form_number,cardNo,pin)" +"VALUES ('" + formNo + "', '" + cardNo + "', '" + pin + "')";
                    connection.statement.executeUpdate(query1);
                    connection.statement.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card Number"+ cardNo + "\n Pin: " + pin);
                }

            }catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == "Cancel") {

        }

    }

    public static void main(String[] args) {
        new SignupThree();
    }

}
