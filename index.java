package quizzzzzzzz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Hp
 */
public class index extends JFrame implements ActionListener {

    Font font = new Font("Arial", Font.BOLD, 24);
    Icon icon = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\index admin.PNG");
    Icon icon1 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\index student.PNG");
    Icon icon2 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Close.PNG");
    JButton b1 = new JButton("Admin", icon);

    JButton b2 = new JButton("User", icon1);

    JButton b3 = new JButton("Exit", icon2);

    index() {
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b1.setBounds(290, 390, 240, 100);
        b2.setBounds(290, 230, 240, 100);
        b3.setBounds(290, 550, 240, 100);

        add(b1);
        add(b2);
        add(b3);
        setLayout(null);
        setVisible(true);
        setSize(900, 900);
        b3.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {

            setVisible(false);
            new Admin().setVisible(true);
        } else if (ae.getSource() == b2) {

            setVisible(false);
            new StudentDetails().setVisible(true);
        }

        else if (ae.getSource() == b3) {
            int a = JOptionPane.showConfirmDialog(null, "Do you really want to Exit application", "Select",
                    JOptionPane.YES_NO_OPTION);
            Object ob = ae.getSource();
            if (a == 0) {
                dispose();
            }

        }
    }

    public static void main(String args[]) {
        index m = new index();

    }

}
