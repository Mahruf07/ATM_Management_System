package bank.management.system;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

    JComboBox occupationOptions,yearlyIncomeOptions,educationQualOptions;
    JTextField identificationNumberTextField;
    JRadioButton sYes,sNo;
    JButton next;

    SignupTwo(){
        setLayout(null);

        JLabel formNo = new JLabel("Form Number: " + SignupOne.random);
        formNo.setBounds(220,20,400,40);
        formNo.setFont(new Font("Rale way",Font.BOLD,35));
        add(formNo);

        JLabel additionalDetails = new JLabel("Page-2: Additional Information");
        additionalDetails.setBounds(250,70,300,40);
        additionalDetails.setFont(new Font("Rale way",Font.BOLD,25));
        add(additionalDetails);

        JLabel occupation = new JLabel("Occupation: ");
        occupation.setBounds(100,150,200,30);
        occupation.setFont(new Font("Rale way",Font.BOLD,20));
        add(occupation);

        // * Create text border component *

        // Create empty border with left padding
        EmptyBorder paddedBorder = new EmptyBorder(0,20,0,0);

        // Create a rounded border
        Border roundedBorder = BorderFactory.createLineBorder(Color.DARK_GRAY,2,true);

        // Combine rounded border with padded border
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder,paddedBorder);

        String[] occupationList = {"Govt Service Holder","Non Govt Service Holder","Self Employed","Business Man","Student","Unemployed","Other"};

        occupationOptions = new JComboBox(occupationList);
        occupationOptions.setBounds(300,150,400,30);
        occupationOptions.setBorder(compoundBorder);
        occupationOptions.setBackground(Color.white);
        occupationOptions.setFont(new Font("Rale way",Font.BOLD,14));
        add(occupationOptions);

        JLabel yearlyIncome = new JLabel("Yearly Income: ");
        yearlyIncome.setBounds(100,190,200,30);
        yearlyIncome.setFont(new Font("Rale way",Font.BOLD,20));
        add(yearlyIncome);

        JLabel yearlyIncome2 = new JLabel("[In Taka]");
        yearlyIncome2.setBounds(100,215,200,30);
        yearlyIncome2.setFont(new Font("Rale way",Font.BOLD,15));
        add(yearlyIncome2);

        String[] IncomeCategories = {"0","< 1,00,000","< 2,00,000 & >= 1,00,000","< 4,00,000 & >= 2,00,000","< 6,00,000 & >= 4,00,000","< 8,00,000 & >= 6,00,000","< 10,00,000 & >= 8,00,000",">=10,00,000"};

        yearlyIncomeOptions = new JComboBox(IncomeCategories);
        yearlyIncomeOptions.setBounds(300,190,400,30);
        yearlyIncomeOptions.setBorder(compoundBorder);
        yearlyIncomeOptions.setBackground(Color.white);
        yearlyIncomeOptions.setFont(new Font("Rale way",Font.BOLD,14));
        add(yearlyIncomeOptions);

        JLabel edqualification1 = new JLabel("Education     :");
        edqualification1.setBounds(100,250,200,30);
        edqualification1.setFont(new Font("Rale way",Font.BOLD,20));
        add(edqualification1);

        JLabel edqualification2 = new JLabel("Qualification ");
        edqualification2.setBounds(100,270,200,30);
        edqualification2.setFont(new Font("Rale way",Font.BOLD,20));
        add(edqualification2);

        String[] edqualificationList = {"Illiterate","Below Secondary","Secondary Passed","Higher Secondary Passed","Undergraduate","Graduated","Doctorate"};

        educationQualOptions = new JComboBox(edqualificationList);
        educationQualOptions.setBounds(300,260,400,30);
        educationQualOptions.setBorder(compoundBorder);
        educationQualOptions.setBackground(Color.white);
        educationQualOptions.setFont(new Font("Rale way",Font.BOLD,14));
        add(educationQualOptions);

        JLabel identificationNumber = new JLabel("Nid/B Cert No: ");
        identificationNumber.setBounds(100,310,200,30);
        identificationNumber.setFont(new Font("Rale way",Font.BOLD,20));
        add(identificationNumber);

        identificationNumberTextField = new JTextField();
        identificationNumberTextField.setBounds(300,310,400,30);
        identificationNumberTextField.setBorder(compoundBorder);
        identificationNumberTextField.setBackground(Color.white);
        identificationNumberTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(identificationNumberTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen: ");
        seniorcitizen.setBounds(100,350,200,30);
        seniorcitizen.setFont(new Font("Rale way",Font.BOLD,20));
        add(seniorcitizen);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(310,350,100,30);
        sYes.setBackground(Color.white);
        add(sYes);

        sNo = new JRadioButton("No");
        sNo.setBounds(430,350,100,30);
        sNo.setBackground(Color.white);
        add(sNo);

        ButtonGroup seniorCitizenBool = new ButtonGroup();
        seniorCitizenBool.add(sYes);
        seniorCitizenBool.add(sNo);

        next = new JButton("Next");
        next.setBounds(600,480,80,30);
        next.setBackground(new Color(36, 160, 237));
        next.setForeground(Color.white);
        next.setFont(new Font("Rale way",Font.PLAIN,15));
        next.addActionListener(this);
        add(next);



        setSize(800,550);
        setLocation(450,70);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sOccupation = (String) occupationOptions.getSelectedItem();
        String sYearlyIncome = (String) yearlyIncomeOptions.getSelectedItem();
        String sEducationQualification = (String) educationQualOptions.getSelectedItem();
        String sIdentificationNumber = identificationNumberTextField.getText();
        String isSeniorCitizen = "";
        if (sYes.isSelected()){
            isSeniorCitizen = "Yes";
        }
        else if (sNo.isSelected()){
            isSeniorCitizen = "No";
        }
        String formNumber = ""+ SignupOne.random;

        try {
            if (sIdentificationNumber == ""){
                JOptionPane.showMessageDialog(null,"Enter Nid / Birth Certificate Number");
            }else {
                Conn c = new Conn();
                String query = "INSERT INTO customer_supplementary " +
                        "(occupation, yearly_income, educational_qualification, is_senior_citizen, identification_number, form_number) " +
                        "VALUES ('" + sOccupation + "', '" + sYearlyIncome + "', '" + sEducationQualification + "', '" + isSeniorCitizen + "', '" + sIdentificationNumber + "','"+formNumber+"')";

                c.statement.executeUpdate(query);
                setVisible(false);
                new SignupThree().setVisible(true);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo();
    }

}
