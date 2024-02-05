import javax.swing.*;

import javax.swing.JFrame;

public class Bankmanagement extends JFrame {
    Bankmanagement(){
        setTitle("Atm machine");
       setSize(800, 480);
       setVisible(true);
       setLocation(350, 200);
    }
    public static void main(String[] args) {
        new Bankmanagement();
    }
}
