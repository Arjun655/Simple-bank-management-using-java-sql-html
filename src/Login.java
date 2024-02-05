//package FILEMANAGER;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
  //  private ImageIcon serviceIcon;
  //  private JLabel myLabel;
   //JLabel pic;

    Login(){
        setTitle("Atm machine");
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);   

     ImageIcon serviceIcon =new ImageIcon(this.getClass().getResource("icons/service.png"));
     JLabel myLabel=new JLabel(serviceIcon);
       myLabel.setSize(658, 458);

  /*      Image n2=n1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
       ImageIcon n3=new ImageIcon(n2);
       JLabel label2=new JLabel(n3);
       label2.setBounds(5000,5000,300,300);
       add(label2);    */ 

       

        JLabel text=new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(250,40,400,40);
        add(text);

         JLabel cardno=new JLabel("Card No: ");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,250,30);
        add(cardno);

        cardTextField=new JTextField();
        cardTextField.setBounds(300,150,230,30);
        cardTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(cardTextField);

         JLabel pinnumber=new JLabel("PIN: ");
        pinnumber.setFont(new Font("Raleway",Font.BOLD,28));
        pinnumber.setBounds(120,220,250,30);
        add(pinnumber);

        pinTextField=new JPasswordField();
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD,14));
        add(pinTextField);

        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

         clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

       getContentPane().setBackground(Color.WHITE);

       setSize(800, 480);
       setVisible(true);
       setLocation(350, 200);
    }

     @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==clear){
         cardTextField.setText("");
         pinTextField.setText("");
       }


       else if(ae.getSource()==login){
        Conn conn=new Conn();
        String cardnumber=cardTextField.getText();
        String pinnumber=pinTextField.getText();    //gettext erom dekache karo eta password field
        String query="select * from login where cardnumber='"+cardnumber+"' and pin='"+pinnumber+"'";


        try{
          //ekhane amra data ke sql theke nichi
          //resultset sql package er modhe pore taii take import korte hobe
          ResultSet rs= conn.s.executeQuery(query);

          if(rs.next()){          //data jodi berie ase tobe ki hobe
            
            setVisible(false);   //tobe login page close hoye atm page  khulbe taii setvisisble-false
            new Transaction(pinnumber).setVisible(true);

          }
          else{
            JOptionPane.showMessageDialog(null,"Incorrect Card number or Pin");
          }

        }
        catch(Exception e){
          System.out.println(e);
        }

       }
       else if(ae.getSource()==signup){

       setVisible(false);
       new SignupOne().setVisible(true);
       }
    }


    public static void main(String[] args) {
        Login oi=new Login();
    }
   
}
