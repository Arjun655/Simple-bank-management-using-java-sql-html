import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.util.*;
//JDBC  connectivity where java framework data save into database
//import com.toedter.calender.JDateChooser;

public class SignupOne extends JFrame implements ActionListener{
long random;
JTextField nameTextField, fnameTextField,dobTextField,emailTextField,addTextField,cityTextField,stateTextField,pincodeTextField;
JButton next;
JRadioButton male,female,other,married,unmarried;
JDateChooser  dateChooser;
    SignupOne(){
        setLayout(null);  //setbound takhn e kaj kore jakhn setlayout null hoy

      Random ran=new Random();
      random=Math.abs((ran.nextLong() % 900L+1000L));

    JLabel formno=new JLabel("APPLICATION FORM NO: "+random);
    formno.setFont(new Font("Raleway",Font.BOLD,38));
    formno.setBounds(140,20,600,40);
    add(formno);

    JLabel personalDetails=new JLabel("Page 1: Personal Details");
    personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
    personalDetails.setBounds(290,80,400,30);
    add(personalDetails);

    JLabel name=new JLabel("Name: ");
    name.setFont(new Font("Raleway",Font.BOLD,20));
    name.setBounds(100,140,100,30);
    add(name);

    nameTextField=new JTextField();
    nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    nameTextField.setBounds(300,140,400,30);
    add(nameTextField);



    JLabel fname=new JLabel("Father's Name: ");
    fname.setFont(new Font("Raleway",Font.BOLD,20));
    fname.setBounds(100,190,200,30);
    add(fname);

    fnameTextField=new JTextField();
    fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
    fnameTextField.setBounds(300,190,400,30);
    add(fnameTextField);



    JLabel dob=new JLabel("Date of Birth: ");
    dob.setFont(new Font("Raleway",Font.BOLD,20));
    dob.setBounds(100,240,200,30);
    add(dob);

    dobTextField=new JTextField();
    dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
    dobTextField.setBounds(300,240,370,30);
    add(dobTextField);    

    dateChooser=new JDateChooser();
    dateChooser.setBounds(300,240,400,30);
    dateChooser.setForeground(new Color(105,105,105));
    add(dateChooser);        



    JLabel gender=new JLabel("Gender: ");
    gender.setFont(new Font("Raleway",Font.BOLD,20));
    gender.setBounds(100,290,200,30);
    add(gender);

 /* JTextField genderTextField=new JTextField();
    genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
    genderTextField.setBounds(300,290,400,30);
    add(genderTextField);   */

    male=new JRadioButton("Male");
    male.setBounds(300,290,60,30);
    male.setBackground(Color.WHITE);
    add(male);

    female=new JRadioButton("Female");
    female.setBounds(450,290,120,30);
    female.setBackground(Color.WHITE);
    add(female);

    ButtonGroup genderGroup=new ButtonGroup();
    genderGroup.add(male);
    genderGroup.add(female);




    JLabel email=new JLabel("Email Address: ");
    email.setFont(new Font("Raleway",Font.BOLD,20));
    email.setBounds(100,340,200,30);
    add(email);

    emailTextField=new JTextField();
    emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
    emailTextField.setBounds(300,340,400,30);
    add(emailTextField);



    JLabel marital=new JLabel("Marital Status: ");
    marital.setFont(new Font("Raleway",Font.BOLD,20));
    marital.setBounds(100,390,200,30);
    add(marital);

/*  JTextField martialTextField=new JTextField();
    martialTextField.setFont(new Font("Raleway",Font.BOLD,14));
    martialTextField.setBounds(300,390,400,30);
    add(martialTextField);   */


    married=new JRadioButton("Married");
    married.setBounds(300,390,100,30);
    married.setBackground(Color.WHITE);
    add(married);

    unmarried=new JRadioButton("Unmarried");
    unmarried.setBounds(450,390,100,30);
    unmarried.setBackground(Color.WHITE);
    add(unmarried);

    other=new JRadioButton("Other");
    other.setBounds(630,390,100,30);
    other.setBackground(Color.WHITE);
    add(other);

    ButtonGroup maritalgroup=new ButtonGroup();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);



    JLabel add=new JLabel("Address: ");
    add.setFont(new Font("Raleway",Font.BOLD,20));
    add.setBounds(100,440,200,30);
    add(add);

    addTextField=new JTextField();
    addTextField.setFont(new Font("Raleway",Font.BOLD,14));
    addTextField.setBounds(300,440,400,30);
    add(addTextField);



    JLabel city=new JLabel("City: ");
    city.setFont(new Font("Raleway",Font.BOLD,20));
    city.setBounds(100,490,200,30);
    add(city);

    cityTextField=new JTextField();
    cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
    cityTextField.setBounds(300,490,400,30);
    add(cityTextField);



    JLabel state=new JLabel("State: ");
    state.setFont(new Font("Raleway",Font.BOLD,20));
    state.setBounds(100,540,200,30);
    add(state);

    stateTextField=new JTextField();
    stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
    stateTextField.setBounds(300,540,400,30);
    add(stateTextField);



    JLabel pincode=new JLabel("Pin Code: ");
    pincode.setFont(new Font("Raleway",Font.BOLD,20));
    pincode.setBounds(100,590,200,30);
    add(pincode);

    pincodeTextField=new JTextField();
    pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
    pincodeTextField.setBounds(300,590,400,30);
    add(pincodeTextField);

    
    next=new JButton("Next");
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setFont(new Font("Raleway", Font.BOLD,14));
    next.setBounds(620,660,80,30);
    next.addActionListener(this);
    add(next);



         getContentPane().setBackground(Color.WHITE);
         setSize(850,800);
         setVisible(true);
         setLocation(350,10);

    }
    public void actionPerformed(ActionEvent ae){
    String formno=" "+random;
    String name=nameTextField.getText();
    String fname=fnameTextField.getText();
    String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
      gender="male";

    }else if(female.isSelected()){
      gender="female";
    }
    String cmail=emailTextField.getText();
    String marital=null;
    if(married.isSelected()){
      marital="Married";
    }else if(unmarried.isSelected()){
      marital="Unmarried";
    }
    else if(other.isSelected()){
      marital="Other";
    }
    String address=addTextField.getText();
    String city=cityTextField.getText();
    String state=stateTextField.getText();
    String pin=pincodeTextField.getText();

    try{
       if(name.equals("")){
          JOptionPane.showMessageDialog(null, "Name is Required");
       }else{
        Conn c=new Conn();
        String query=" insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+cmail+"','"+marital+"', '"+address+"','"+city+"', '"+pin+"','"+state+"')";
        c.s.executeUpdate(query);
       
        setVisible(false);
        new SignupTwo(formno).setVisible(true);
       }
    }catch(Exception e){
      System.out.println(e);
    }

     try{
       if(fname.equals("")){
          JOptionPane.showMessageDialog(null, "Father's name is Required");
       }
    }catch(Exception e){
      System.out.println(e);
    }

    try{
       if(dob.equals("")){
          JOptionPane.showMessageDialog(null, "Date of birth is Required");
       }
    }catch(Exception e){
      System.out.println(e);
    }

     try{
       if(cmail.equals("")){
          JOptionPane.showMessageDialog(null, "Email is Required");
       }
    }catch(Exception e){
      System.out.println(e);
    }

     try{
       if(address.equals("")){
          JOptionPane.showMessageDialog(null, "Address is Required");
       }
    }catch(Exception e){
      System.out.println(e);
    }

     try{
       if(city.equals("")){
          JOptionPane.showMessageDialog(null, "City is Required");
       }
    }catch(Exception e){
      System.out.println(e);
    }
    

    }

    public static void main(String[] args){
       SignupOne op= new SignupOne();

     
    }
}
