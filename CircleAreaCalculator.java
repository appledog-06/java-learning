import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleAreaCalculator extends JFrame implements ActionListener {

    private JTextField radiusField;
    private JLabel resultLabel;

    public CircleAreaCalculator() {
        // Set up the JFrame
        setTitle("Circle Area Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel radiusLabel = new JLabel("Enter the radius:");
        radiusField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this); // Register the ActionListener
        resultLabel = new JLabel();

        // Set up the layout
        setLayout(new FlowLayout());
        add(radiusLabel);
        add(radiusField);
        add(calculateButton);
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Calculate")) {
            try {
                double radius = Double.parseDouble(radiusField.getText());
                double area = Math.PI * Math.pow(radius, 2);
                resultLabel.setText("Area: " + area);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CircleAreaCalculator().setVisible(true);
        });
    }
}
