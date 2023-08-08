import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventhandler  implements ActionListener {
    View v;
    public Eventhandler(View v){
        this.v=v;
    }
    public void actionPerformed(ActionEvent e){
        Font f=new Font("arial",Font.BOLD,20);
        this.v.t.setFont(f);
        this.v.t.setForeground(Color.RED);
    }
}


