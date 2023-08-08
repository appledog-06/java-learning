import javax.swing.*;
import java.awt.event.*;
public class popup extends WindowAdapter{
    JFrame f;
    public popup() {
        f = new JFrame();
        f.setSize(400, 500);
        f.addWindowListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation((JFrame.DO_NOTHING_ON_CLOSE));
    }
    public void windowClosing(WindowEvent e){
        int choice=JOptionPane.showConfirmDialog(f,"do you want to close?");
        if(choice==JOptionPane.YES_OPTION) {
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        }
        public static void main(String[]args){
        new popup();

    }
}
