package quizzzzzzzz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adminHome extends JFrame implements MouseListener {

    Font font = new Font("Arial", Font.BOLD, 19);
    ImageIcon icon = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\add new question.PNG ");
    JButton b = new JButton("Add New Question", icon);
    ImageIcon icon2 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Update Question.PNG ");
    JButton b1 = new JButton("update Question", icon2);
    //ImageIcon icon3 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\all questions.PNG ");
   // JButton b2 = new JButton("All Question", icon3);
    ImageIcon icon4 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\delete Question.PNG ");
    JButton b3 = new JButton(" Delete Question", icon4);
   // ImageIcon icon5 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\all student result.PNG ");
    //JButton b4 = new JButton("All Student Result", icon5);
    ImageIcon icon6 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Logout.PNG ");
    JButton b5 = new JButton("Logout", icon6);
    ImageIcon icon7 = new ImageIcon("C:\\Users\\Hp\\Desktop\\Qems Icon Jframe\\Close.PNG ");
    JButton b6 = new JButton("Exit", icon7);
    JLabel l = new JLabel("Admin Panel");
    public static int open = 0;

    adminHome() {

        setVisible(true);
        setSize(1000, 1000);
        setLayout(null);

        l.setBounds(250, 50, 700, 80);

        b.setBounds(60, 250, 270, 80);
        b.setFont(font);

        b1.setBounds(340, 250, 270, 80);

        

        b3.setBounds(620, 250, 270, 80);

       

        b5.setBounds(200, 350, 270, 80);

        b6.setBounds(500, 350, 270, 80);
        l.setFont(new Font("Arial", Font.BOLD, 50));
        b1.setFont(font);
        
        b3.setFont(font);
       
        b5.setFont(font);
        b6.setFont(font);

        add(l);
        add(b);
        add(b1);
        //add(b2);
        add(b3);
       // add(b4);
        add(b5);
        add(b6);

        b5.addMouseListener(this);
        b6.addMouseListener(this);
        b.addMouseListener(this);
        b1.addMouseListener(this);
        b3.addMouseListener(this);
        // b4.addMouseListener(this);
         //b2.addMouseListener(this);

    }

    public void mouseClicked(MouseEvent ae) {
        if (ae.getSource() == b5) {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
            //int a= jOptionPane.showConfirmDialog(jf,"Do you really want to LogOut","Select",JOptionPanee.YES_NO_OPTION);
            if (a == 0) {

                setVisible(false);
                new Admin().setVisible(true);
            }
        } else if (ae.getSource() == b6) {

            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Exit application", "Select", JOptionPane.YES_NO_OPTION);
            //int a= jOptionPane.showConfirmDialog(jf,"Do you really want to LogOut","Select",JOptionPanee.YES_NO_OPTION);
            if (a == 0) {

                System.exit(0);
            }

        } else if (ae.getSource() == b) {
            if (open == 0) {

                new AddnewQuestion().setVisible(true);
                open = 1;
            } else {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "One form is already opened");
            }
        }
        
        else if (ae.getSource() == b1) {
            
             if (open == 0) {

                new updateQuestion().setVisible(true);
                open = 1;
            } else {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "One form is already opened");
            }
        
        
        }
        
         else if (ae.getSource() == b3) {
            
             if (open == 0) {

                new deleteQuestion().setVisible(true);
                open = 1;
            } else {
                JFrame jf = new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "One form is already opened");
            }
        
        
       
        
        
        }
         
        
        

    }

    public void mousePressed(MouseEvent ae) {
    }

    public void mouseReleased(MouseEvent ae) {
    }

    public void mouseEntered(MouseEvent ae) {
    }

    public void mouseExited(MouseEvent ae) {
    }

    public static void main(String[] args) {

        adminHome i = new adminHome();
    }

}


