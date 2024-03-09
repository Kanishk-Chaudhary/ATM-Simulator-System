
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("KMB Login Page");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource(".\\assets\\logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to Kanishk Mini Bank");
        text.setFont(new Font("Oswald", Font.BOLD, 30));
        text.setBounds(200, 40, 600, 40);
        add(text);

        JLabel Cardno = new JLabel("Card Number: ");
        Cardno.setFont(new Font("Arial", Font.BOLD, 20));
        Cardno.setBounds(200, 180, 600, 30);
        add(Cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(400, 180, 260, 30);
        cardTextField.setColumns(4);
        add(cardTextField);

        JLabel Pin = new JLabel("PIN: ");
        Pin.setFont(new Font("Arial", Font.BOLD, 20));
        Pin.setBounds(200, 230, 600, 30);
        add(Pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(400, 230, 260, 30);
        add(pinTextField);

        login = new JButton("LOG IN");
        login.setFont(new Font("Arial", Font.BOLD, 12));
        login.setBounds(400, 300, 80, 30);
        login.addActionListener(this);
        add(login);

        signup = new JButton("SIGN UP");
        signup.setFont(new Font("Arial", Font.BOLD, 12));
        signup.setBounds(490, 300, 80, 30);
        signup.addActionListener(this);
        add(signup);

        clear = new JButton("CLEAR");
        clear.setFont(new Font("Arial", Font.BOLD, 12));
        clear.setBounds(580, 300, 80, 30);
        clear.addActionListener(this);
        add(clear);

        getContentPane().setBackground(Color.LIGHT_GRAY);

        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login) {
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup().setVisible(true);
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
