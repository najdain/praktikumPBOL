import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginRegisterApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login & Register");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CardLayout cardLayout = new CardLayout();
        frame.setLayout(cardLayout);


        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        addComponent(loginPanel, gbc, emailLabel, emailField, 0);

        
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        addComponent(loginPanel, gbc, passwordLabel, passwordField, 1);

        
        JButton loginButton = new JButton("Login");
        gbc.gridx = 1; 
        gbc.gridy = 2;
        loginPanel.add(loginButton, gbc);

        
        JButton switchToRegisterButton = new JButton("Sign Up");
        switchToRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Register");
            }
        });
        gbc.gridy = 3;
        loginPanel.add(switchToRegisterButton, gbc);

        
        JPanel registerPanel = new JPanel(new GridBagLayout());

        
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField(20);
        addComponent(registerPanel, gbc, nameLabel, nameField, 0);

        
        JLabel regEmailLabel = new JLabel("Email:");
        JTextField regEmailField = new JTextField(20);
        addComponent(registerPanel, gbc, regEmailLabel, regEmailField, 1);

        
        JLabel regPasswordLabel = new JLabel("Password:");
        JPasswordField regPasswordField = new JPasswordField(20);
        addComponent(registerPanel, gbc, regPasswordLabel, regPasswordField, 2);

        
        JButton registerButton = new JButton("Sign Up");
        gbc.gridx = 1; 
        gbc.gridy = 3;
        registerPanel.add(registerButton, gbc);

        
        JButton switchToLoginButton = new JButton("Login");
        switchToRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(frame.getContentPane(), "Login");
            }
        });
        gbc.gridy = 4;
        registerPanel.add(switchToLoginButton, gbc);

        frame.add(loginPanel, "Login");
        frame.add(registerPanel, "Register");

        cardLayout.show(frame.getContentPane(), "Login");
        frame.setVisible(true);
    }

    private static void addComponent(JPanel panel, GridBagConstraints gbc, JLabel label, JTextField field, int yPos) {
        gbc.gridx = 0; gbc.gridy = yPos;
        panel.add(label, gbc);
        gbc.gridx = 1;
        panel.add(field, gbc);
    }
}
