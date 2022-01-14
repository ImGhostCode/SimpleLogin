import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements Action{
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    JFrame frame;
    JLabel userIDLabel;
    JLabel userPassLabel;
    JLabel massegeLabel;
    JPasswordField uPasswordField;
    JTextField uIDField;
    JButton loginButton;
    JButton resetButton;
    JButton exitButton;

    LoginPage (HashMap<String, String> loginInfoOrigin){
        loginInfo = loginInfoOrigin;

        frame = new JFrame("Login");

        userIDLabel = new JLabel("UserID:");
        userIDLabel.setBounds(50, 100, 75, 25);

        userPassLabel = new JLabel("Password:");
        userPassLabel.setBounds(50, 150, 75, 25);

        massegeLabel = new JLabel();
        massegeLabel.setBounds(100, 250, 250, 35);
        massegeLabel.setFont(new Font(null, Font.ITALIC, 25));

        uPasswordField = new JPasswordField();
        uPasswordField.setBounds(125,150, 200, 25);
        uIDField = new JTextField();
        uIDField.setBounds(125, 100, 200, 25);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.setBounds(300, 200, 100, 25);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setSize(420,420);
        //frame.pack();

        frame.add(userIDLabel);
        frame.add(userPassLabel);
        frame.add(uIDField);
        frame.add(uPasswordField);
        frame.add(massegeLabel);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(exitButton);
        
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == loginButton ){
            String userId = uIDField.getText();
            String pass = String.valueOf(uPasswordField.getPassword());
            if (loginInfo.containsKey(userId)){
                if (loginInfo.get(userId).equals(pass)){
                    massegeLabel.setBackground(Color.GREEN);
                    massegeLabel.setText("Login Successful!");
                    frame.dispose();
                    WellcomePage test = new WellcomePage(userId);
                } else {
                    massegeLabel.setBackground(Color.RED);
                    massegeLabel.setText("Wrong password");
                }
            } else{
                massegeLabel.setText("Not found userID");
                massegeLabel.setBackground(Color.RED);
            } 
        }

        if (arg0.getSource() == resetButton){
            uIDField.setText("");
            uPasswordField.setText("");
        }

        if (arg0.getSource() == exitButton){
            System.exit(0);
        }
        
    }

  
}
