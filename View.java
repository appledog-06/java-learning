import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class View extends JFrame {
    JTextField t;
    JButton b;
    public View() {
        setSize(400, 500);
        setTitle("demo");
        t = new JTextField();
        t.setColumns(10);
        b = new JButton("click");
        add(t);
        add(b);
        setLayout(new FlowLayout());
        setVisible(true);
        Eventhandler ev = new Eventhandler(this);
        b.addActionListener(ev);
    }
    public static void main(String[]args){
            new View();
        }
    }

