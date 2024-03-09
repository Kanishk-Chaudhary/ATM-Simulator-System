
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.util.*;
import java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener {

    JTextField religionTextField, panTextField, aadharTextField, addressTextField, pinTextField;
    JButton next;
    JRadioButton tenth, twelfth, graduate, yes, no;

    Signup2() {

        JLabel additional = new JLabel("Page 2: Additional Details");
        additional.setFont(new Font("Raleway", Font.BOLD, 30));
        additional.setBounds(280, 70, 600, 40);
        add(additional);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 15));
        religion.setBounds(100, 130, 600, 40);
        add(religion);

        religionTextField = new JTextField();
        religionTextField.setBounds(300, 130, 300, 40);
        add(religionTextField);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 15));
        income.setBounds(100, 190, 600, 40);
        add(income);

        String valincome[] = { "Below 100000", "Between 100000-300000", "Above 300000" };
        JComboBox vincome = new JComboBox(valincome);
        vincome.setBounds(300, 190, 300, 40);
        add(vincome);

        JLabel education = new JLabel("Education:");
        education.setFont(new Font("Raleway", Font.BOLD, 15));
        education.setBounds(100, 250, 600, 40);
        add(education);

        tenth = new JRadioButton("10th Pass");
        tenth.setBounds(300, 250, 80, 40);
        tenth.setBackground(Color.lightGray);
        add(tenth);

        twelfth = new JRadioButton("12th Pass");
        twelfth.setBounds(400, 250, 80, 40);
        twelfth.setBackground(Color.lightGray);
        add(twelfth);

        graduate = new JRadioButton("Graduate");
        graduate.setBounds(500, 250, 80, 40);
        graduate.setBackground(Color.lightGray);
        add(graduate);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(tenth);
        gendergroup.add(twelfth);
        gendergroup.add(graduate);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 15));
        pan.setBounds(100, 310, 600, 40);
        add(pan);

        panTextField = new JTextField();
        panTextField.setBounds(300, 310, 300, 40);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 15));
        aadhar.setBounds(100, 370, 600, 40);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setBounds(300, 370, 300, 40);
        add(aadharTextField);

        JLabel account = new JLabel("Existing Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 15));
        account.setBounds(100, 430, 600, 40);
        add(account);

        yes = new JRadioButton("Yes");
        yes.setBounds(300, 430, 60, 40);
        yes.setBackground(Color.lightGray);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(400, 430, 60, 40);
        no.setBackground(Color.lightGray);
        add(no);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(yes);
        accountgroup.add(no);

        JLabel scitizen = new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("Raleway", Font.BOLD, 15));
        scitizen.setBounds(100, 490, 600, 40);
        add(scitizen);

        yes = new JRadioButton("Yes");
        yes.setBounds(300, 490, 60, 40);
        yes.setBackground(Color.lightGray);
        add(yes);

        no = new JRadioButton("No");
        no.setBounds(400, 490, 60, 40);
        no.setBackground(Color.lightGray);
        add(no);

        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(yes);
        citizengroup.add(no);

        next = new JButton("Next");
        next.setBounds(520, 550, 80, 40);
        next.addActionListener(this);
        add(next);

        setTitle("KMB Additional Details for Signup Page");
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(800, 800);
        setVisible(true);
        setLocation(350, 10);
    }

    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String religion = religionTextField.getText();
        String income = (String) vincome.getSelectedItem();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }
        String email = emailTextField.getText();
        String phonno = pnoTextField.getText();
        String address = addressTextField.getText();
        String pincode = pinTextField.getText();

        try {
            if (fullname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values('" + formno + "', '" + fullname +
                        "', '" + dob + "', '"
                        + gender + "', '" + email + "','" + phonno + "', '" + address + "', '" +
                        pincode + "')";
                c.s.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new Signup2();
    }
}
