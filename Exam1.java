import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exam1 extends JFrame{
    JButton b1,b2,b3;
    public Exam1() {
        setSize(500, 600);
        setTitle("exam");
        b1 = new JButton("red");
        b2 = new JButton("pink");
        b3 = new JButton("blue");
        add(b1);
        add(b2);
        add(b3);
        setLayout((new FlowLayout()));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);

            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.PINK);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.BLUE);
            }
        });
    }
        public static void main(String[]args) {
            new Example();
        }
    }

