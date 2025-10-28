import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JLabel label = new JLabel("Hello, World!", SwingConstants.CENTER);
         
        JButton button1 = new JButton("Press Me");
        JButton button2 = new JButton("Press Me Too");
        JButton button3 = new JButton("Another One");
        JButton button4 = new JButton("Final Button");

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        // Add action listeners for each button
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You did it!");
            } 
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You did it again!");
            }
        });
        
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("You're on a roll!");
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("That's all the buttons!");
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}