import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.sql.*;


public class Ministatement extends JFrame implements ActionListener{
String pinnumber;
Ministatement(String pinnumber){

   setLayout(null);


   JLabel mini=new JLabel();
   add(mini);

   JLabel bank=new JLabel("STATE BANK OF INDIA");
   bank.setBounds(150,20,100,20);
   add(bank);

    JLabel card=new JLabel();
     card.setBounds(20,80,300,20);
     add(card);

     JLabel balance=new JLabel();
     balance.setBounds(20,400,300,20);
     add(balance);



   try{
       Conn conn=new Conn();
         
     ResultSet rs=  conn.s.executeQuery("Select * from login where pin= '"+pinnumber+"'");

     while(rs.next()){
      card.setText("Card Number: "+rs.getString("cardnumber").substring(0,4)+"XXXXXXXXXXXX" +rs.getString("cardnumber").substring(13));
      //Card number purota statement e dekhay na taii substring use hoche
     }

   }catch(Exception e){
      System.out.println(e);
   }

  
try{
 Conn conn=new Conn();
 int bal= 0;
 ResultSet rs=conn.s.executeQuery("Select * from bank where pin='"+pinnumber+"'");


 while(rs.next()){
     mini.setText(mini.getText() +  "<html>" + rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
    //set text overwrite kore

   
   if(rs.getString("type").equals("Deposit")){
       bal +=Integer.parseInt(rs.getString("amount"));
   }
   else{
       bal-=Integer.parseInt(rs.getString("amount"));
   }
 }

 balance.setText("Your Current account balance is Rs " + bal);


}catch(Exception e){
   System.out.println(e);
}


mini.setBounds(20,140,400,200);


   setSize(400,600);
   getContentPane().setBackground(Color.WHITE);
   setVisible(true);
   setTitle("Mini statement");
   setLocation(20,20);

  
}


public void actionPerformed(ActionEvent ae){
   this.setVisible(false);

}



    public static void main(String[] args) {
       new Ministatement(""); 
    }

   
    }

