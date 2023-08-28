package bank.management.system;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {

    SignupOne(){
        setLayout(null);

        Random rand = new Random();
        long random = Math.abs((rand.nextLong() % 9000L) + 1000L);

        JLabel formNo = new JLabel("Form Number: " + random);
        formNo.setBounds(220,20,400,40);
        formNo.setFont(new Font("Rale way",Font.BOLD,35));
        add(formNo);

        JLabel personalDetails = new JLabel("Personal Details");
        personalDetails.setBounds(300,70,300,40);
        personalDetails.setFont(new Font("Rale way",Font.BOLD,25));
        add(personalDetails);

        JLabel name = new JLabel("Name: ");
        name.setBounds(100,150,200,30);
        name.setFont(new Font("Rale way",Font.BOLD,20));
        add(name);

        // * Create text border component *

        // Create empty border with left padding
        EmptyBorder paddedBorder = new EmptyBorder(0,20,0,0);

        // Create a rounded border
        Border roundedBorder = BorderFactory.createLineBorder(Color.DARK_GRAY,2,true);

        // Combine rounded border with padded border
        Border compoundBorder = BorderFactory.createCompoundBorder(roundedBorder,paddedBorder);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(300,150,400,30);
        nameTextField.setBorder(compoundBorder);
        nameTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(nameTextField);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(100,190,200,30);
        dob.setFont(new Font("Rale way",Font.BOLD,20));
        add(dob);

        JDateChooser dateSelect = new JDateChooser();
        dateSelect.setBounds(300,190,400,30);
        dateSelect.setBackground(Color.white);
        dateSelect.setBorder(compoundBorder);
        add(dateSelect);

        JLabel fName = new JLabel("Father's Name: ");
        fName.setBounds(100,230,200,30);
        fName.setFont(new Font("Rale way",Font.BOLD,20));
        add(fName);

        JTextField fnameTextField = new JTextField();
        fnameTextField.setBounds(300,230,400,30);
        fnameTextField.setBorder(compoundBorder);
        fnameTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(fnameTextField);

        JLabel gender = new JLabel("Gender: ");
        gender.setBounds(100,270,200,30);
        gender.setFont(new Font("Rale way",Font.BOLD,20));
        add(gender);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(310,270,100,30);
        male.setBackground(Color.white);
        add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(430,270,100,30);
        female.setBackground(Color.white);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel religion = new JLabel("Religion: ");
        religion.setBounds(100,310,200,30);
        religion.setFont(new Font("Rale way",Font.BOLD,20));
        add(religion);

        JTextField religionTextField = new JTextField();
        religionTextField.setBounds(300,310,400,30);
        religionTextField.setBorder(compoundBorder);
        religionTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(religionTextField);

        JLabel mobileNumber = new JLabel("Mobile Number: ");
        mobileNumber.setBounds(100,350,200,30);
        mobileNumber.setFont(new Font("Rale way",Font.BOLD,20));
        add(mobileNumber);

        JTextField mobileNumberTextField = new JTextField();
        mobileNumberTextField.setBounds(300,350,400,30);
        mobileNumberTextField.setBorder(compoundBorder);
        mobileNumberTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(mobileNumberTextField);

        JLabel email = new JLabel("Email: ");
        email.setBounds(100,390,200,30);
        email.setFont(new Font("Rale way",Font.BOLD,20));
        add(email);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(300,390,400,30);
        emailTextField.setBorder(compoundBorder);
        emailTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(emailTextField);

        JLabel maritalStatus = new JLabel("Marital Status: ");
        maritalStatus.setBounds(100,430,200,30);
        maritalStatus.setFont(new Font("Rale way",Font.BOLD,20));
        add(maritalStatus);

        JRadioButton married = new JRadioButton("Married");
        married.setBounds(310,430,100,30);
        married.setBackground(Color.white);
        add(married);

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(430,430,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        ButtonGroup mariatalButtonGroup = new ButtonGroup();
        mariatalButtonGroup.add(married);
        mariatalButtonGroup.add(unmarried);

        JLabel address = new JLabel("Address: ");
        address.setBounds(100,470,200,30);
        address.setFont(new Font("Rale way",Font.BOLD,20));
        add(address);

        JTextField addressTextField = new JTextField();
        addressTextField.setBounds(300,470,400,30);
        addressTextField.setBorder(compoundBorder);
        addressTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(addressTextField);

        JLabel division = new JLabel("Division: ");
        division.setBounds(100,510,200,30);
        division.setFont(new Font("Rale way",Font.BOLD,20));
        add(division);

        JTextField divisionTextField = new JTextField();
        divisionTextField.setBounds(300,510,400,30);
        divisionTextField.setBorder(compoundBorder);
        divisionTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(divisionTextField);

        JLabel district = new JLabel("District: ");
        district.setBounds(100,550,200,30);
        district.setFont(new Font("Rale way",Font.BOLD,20));
        add(district);

        JTextField districtTextField = new JTextField();
        districtTextField.setBounds(300,550,400,30);
        districtTextField.setBorder(compoundBorder);
        districtTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(districtTextField);

        JLabel upazila = new JLabel("Upazila: ");
        upazila.setBounds(100,590,200,30);
        upazila.setFont(new Font("Rale way",Font.BOLD,20));
        add(upazila);

        JTextField upazilaTextField = new JTextField();
        upazilaTextField.setBounds(300,590,400,30);
        upazilaTextField.setBorder(compoundBorder);
        upazilaTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(upazilaTextField);

        JLabel postCode = new JLabel("Post Code: ");
        postCode.setBounds(100,630,200,30);
        postCode.setFont(new Font("Rale way",Font.BOLD,20));
        add(postCode);

        JTextField postCodeTextField = new JTextField();
        postCodeTextField.setBounds(300,630,400,30);
        postCodeTextField.setBorder(compoundBorder);
        postCodeTextField.setFont(new Font("Rale way",Font.BOLD,14));
        add(postCodeTextField);

        JButton next = new JButton("Next");
        next.setBounds(640,680,80,30);
        next.setBackground(new Color(36, 160, 237));
        next.setForeground(Color.white);
        next.setFont(new Font("Rale way",Font.PLAIN,15));
        add(next);

        setSize(800,780);
        setLocation(450,70);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}
