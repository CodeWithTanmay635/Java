import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        // Create a frame (window)
        JFrame frame = new JFrame("Checkbox Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("I agree to the terms");

        // Add an action listener to detect changes
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox is checked");
                } else {
                    System.out.println("Checkbox is unchecked");
                }
            }
        });

        // Add checkbox to frame
        frame.add(checkBox);

        // Make frame visible
        frame.setVisible(true);
    }
}
