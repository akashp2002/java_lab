import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(7, 2, 10, 10));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();
        
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        JRadioButton otherButton = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        
        JLabel courseLabel = new JLabel("Course:");
        JComboBox<String> courseComboBox = new JComboBox<>(new String[]{"B.Tech", "B.Sc", "B.Com"});
        
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        JCheckBox readingCheckBox = new JCheckBox("Reading");
        JCheckBox travelingCheckBox = new JCheckBox("Traveling");
        JCheckBox gamingCheckBox = new JCheckBox("Gaming");
        
        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        
        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        
        frame.add(emailLabel);
        frame.add(emailField);
        
        frame.add(genderLabel);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        frame.add(genderPanel);
        
        frame.add(courseLabel);
        frame.add(courseComboBox);
        
        frame.add(hobbiesLabel);
        JPanel hobbiesPanel = new JPanel();
        hobbiesPanel.add(readingCheckBox);
        hobbiesPanel.add(travelingCheckBox);
        hobbiesPanel.add(gamingCheckBox);
        frame.add(hobbiesPanel);
        
        frame.add(submitButton);
        frame.add(resetButton);
        
        // ActionListener for Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String gender = "";
                if (maleButton.isSelected()) gender = "Male";
                else if (femaleButton.isSelected()) gender = "Female";
                else if (otherButton.isSelected()) gender = "Other";
                String course = (String) courseComboBox.getSelectedItem();
                StringBuilder hobbies = new StringBuilder();
                if (readingCheckBox.isSelected()) hobbies.append("Reading ");
                if (travelingCheckBox.isSelected()) hobbies.append("Traveling ");
                if (gamingCheckBox.isSelected()) hobbies.append("Gaming");

                // Validate Name and Email fields
                if (name.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Name and Email cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Show the submitted data in a JOptionPane message dialog
                    JOptionPane.showMessageDialog(frame, "Submitted Data:\n" +
                            "Name: " + name + "\n" +
                            "Email: " + email + "\n" +
                            "Gender: " + gender + "\n" +
                            "Course: " + course + "\n" +
                            "Hobbies: " + hobbies.toString(),
                            "Registration Details", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        // ActionListener for Reset button
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset all fields
                nameField.setText("");
                emailField.setText("");
                genderGroup.clearSelection();
                courseComboBox.setSelectedIndex(0);
                readingCheckBox.setSelected(false);
                travelingCheckBox.setSelected(false);
                gamingCheckBox.setSelected(false);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
