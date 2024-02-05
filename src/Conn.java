//how java program connect with mysql server watch bellow
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        //this is the process how we connect java program to sql
        try{
           c=DriverManager.getConnection("jdbc:mysql:///Bank","root", "12345678");
           s= c.createStatement();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}




