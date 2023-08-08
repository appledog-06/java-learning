import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Example extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    public Example(){
        setSize(500,600);
        setTitle("demo");
        b1=new JButton("red");
        b2=new JButton("pink");
        b3=new JButton("blue");
        add(b1);
        add(b2);
        add(b3);
        setLayout(new FlowLayout());
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);;
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String btn=e.getActionCommand();
        if(btn.equals("red")) {
            setBackground(Color.RED);
            getContentPane().setBackground(Color.RED);
        }
        else if(btn.equals("pink")){
            setBackground(Color.PINK);
            getContentPane().setBackground(Color.PINK);
        }
        else{
            getContentPane().setBackground(Color.BLUE);
        }
    }
    public static void main(String[]args){
        new Example();
    }
}