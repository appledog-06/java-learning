
import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[]args){
        String name=JOptionPane.showInputDialog("what is your good name?");
        JOptionPane.showMessageDialog(null,"hello"+name);
        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"you are"+age);
        double height=Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null,"your height is "+height+"cm tall");


    }

}
