import javax.swing.*;
import java.awt.*;

public class NepalFlagDrawing extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the green rectangle
        g.setColor(Color.GREEN);
        g.fillRect(50, 50, 300, 200);

        // Draw the flag of Nepal (simplified version)
        g.setColor(Color.RED);
        int[] xPoints = {100, 200, 100};
        int[] yPoints = {50, 150, 150};
        g.fillPolygon(xPoints, yPoints, 3);
        int [] x2={100,200,200};
        int [] y2={50,150,150};
        g.fillPolygon(x2,y2,3);
        g.setColor(Color.BLUE);
        g.drawLine(100,50,100,300);
        
        // Draw the "My Nepal" text
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("My Nepal", 150, 280);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Nepal Flag Drawing");
        NepalFlagDrawing flagDrawing = new NepalFlagDrawing();
        frame.add(flagDrawing);
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
