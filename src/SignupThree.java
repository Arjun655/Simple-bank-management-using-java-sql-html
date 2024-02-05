import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
  JRadioButton r1,r2,r3,r4;
  JCheckBox c1,c2,c3,c4,c5,c6,c7;
  JButton submit,cancel;
  String formno;

    SignupThree(String formno){
        this.formno= formno;

        setLayout(null);

        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);


        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1=new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,160,20);
        add(r1);

        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,210,20);
        add(r2);

        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,160,20);
        add(r3);

        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,230,20);
        add(r4);

        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);

        JLabel number=new JLabel("XXXX-XXXX-XXXX-9315");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);

        JLabel cardnumber=new JLabel("This is your 16 digit card number");
        cardnumber.setFont(new Font("Raleway",Font.BOLD,12));
        cardnumber.setBounds(100,330,390,20);
        add(cardnumber);

         JLabel pin=new JLabel("Pin Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);

        JLabel pnumber2=new JLabel("XXXX");
        pnumber2.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber2.setBounds(330,370,300,30);
        add(pnumber2);

        JLabel pindetail=new JLabel("This is your 4 digit password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,390,20);
        add(pindetail);

        JLabel services=new JLabel("Services Required: ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);

        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("INTERNET BANKING");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("MOBILE BANKING");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("EMAIL & SMS ALERT");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5=new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,400,30);
        add(c6);

        c7=new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);

        //c2=new JCheckBox()
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setVisible(true);
        setLocation(350,0);
    }

        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==submit){
               String accountType=null;
               if(r1.isSelected()){
                accountType="Saving Account";
               }else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
               }else if(r3.isSelected()){
                accountType="Current Account";
               }else if(r4.isSelected()){
                accountType="Recurring Deposit Account";
               }
               //this is how we generate the card number and pin number
            Random random=new Random();
            String cardnumber=" "+Math.abs((random.nextLong() % 90000000L) + 8040937000050000L);

            String pinnumber=" "+Math.abs((random.nextLong()% 9000L) +1000L);

            //aksathe sob pete gele string tairi korte hobe
            String facility=" ";
            if(c1.isSelected()){
                facility=facility+" ATM card";
            }else if(c2.isSelected()){
                facility=facility+" Internet Banking";
            }else if(c3.isSelected()){
                facility=facility+" Mobile Banking";
            }else if(c4.isSelected()){
                facility=facility+" Email & Sms alert";
            }else if(c5.isSelected()){
                facility=facility+" Cheque Book";
            }else if(c6.isSelected()){
                facility=facility+" E statement";
            }
             

            try{
                if(accountType.equals(" ")){
                    JOptionPane.showMessageDialog(null,"Account type is required");
                }else{
                    //ekhanei database er sathe connect ta holo
                    Conn conn=new Conn();
                    String query1="insert into Signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2="insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);


                  JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n Pin: "+pinnumber);

                  setVisible(false);
                  new Deposit(pinnumber).setVisible(false);
                }
            }catch(Exception e){
                System.out.println(e);
            }


            }else if(ae.getSource()==cancel){
                setVisible(false);
                new Login().setVisible(true);
            
        
        }

    }

    public static void main(String[] args) {
        SignupThree gth=new SignupThree(" ");

    }
}
